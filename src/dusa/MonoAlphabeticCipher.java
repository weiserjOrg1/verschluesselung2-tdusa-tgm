package dusa;

/**
 * Die Klasse mit den Methoden encrypt und decrypt
 * @author Tobias
 * @version 20.10.2018
 */
public class MonoAlphabeticCipher implements Cipher {
		private String secretAlphabet;
		
		public MonoAlphabeticCipher(){
			this.secretAlphabet = "abcdefghijklmnopqrstuvwxyz����";
		}
		
		public String getSecretAlphabet(){
			return this.secretAlphabet;
		}
		
		protected void setSecretAlphabet(String newSA) throws Exception{
			newSA.toLowerCase();
			if(secretAlphabet.length() == this.secretAlphabet.length() && checkNumbOfLetters(newSA) == false && containsLetters(newSA) == true){
				this.secretAlphabet = newSA;
			}else {
				Exception in1 = new Exception("Bitte geben Sie ein g�ltiges Verschl�sselungsalphabet ein");
				throw in1;
			}
		}
	
		private boolean checkNumbOfLetters(String SA) {
			for(int i = 0; i < SA.length(); i++){
				if(SA.indexOf(SA.charAt(i)) == SA.lastIndexOf(SA.charAt(i))){
					return false;
				}
			}
			return true;
		}
		
		private boolean containsLetters(String secretAlphabet) {
			String a1 = "abcdefghijklmnopqrstuvwxyz����";
			for(int i = 0; i < secretAlphabet.length(); i++) {
				if(secretAlphabet.indexOf(a1.charAt(i)) == -1){
					return false;
				}
			}
			return true;
		}
		
		@Override
		public String encrypt(String s1) throws Exception{
			String t1 = "";
			if(s1 == null || s1 == "") {
				Exception in1 = new Exception("Ung�ltige Eingabe. -> 's1' darf nicht leer sein!");
				throw in1;
			}else {
				s1 = s1.toLowerCase();
				String a2 = "abcdefghijklmnopqrstuvwxyz����";
				for(int i = 0; i < s1.length(); i++) {
					try {
						t1 += this.secretAlphabet.charAt(a2.indexOf(s1.charAt(i)));
					}catch(StringIndexOutOfBoundsException e) {
						t1 += s1.charAt(i)+"";
					}
				}
			}
			return t1;	
		}
		/**
		 * Diese Methode entschl�sselt den �bergebenen Text und gibt ihn dann zur�ck.
		 * @param s1 �bernimmt den verschl�sselten Text
		 * @return gibt den entschl�sselten Text zur�ck 
		 */
		@Override
		public String decrypt(String s1) throws Exception{
			String t1 = "";
			if(s1 == null || s1 == "") {
				Exception in1 = new Exception("Ung�ltige Eingabe. -> 's1' darf nicht leer sein!");
				throw in1;
			}else {
				s1 = s1.toLowerCase();
				String a2 = "abcdefghijklmnopqrstuvwxyz����";
				for(int i = 0; i < s1.length(); i++) {
					try {
						t1 += a2.charAt(this.secretAlphabet.indexOf(s1.charAt(i)));
					}catch(StringIndexOutOfBoundsException e) {
						t1 += s1.charAt(i)+"";
					}
				}
			}
			return t1;
		}
}
