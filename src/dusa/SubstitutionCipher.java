package dusa;

/**
 * Hier wird das secretAlphabet neu gesetzte bzw. bestimmt oder auch übergeben.
 * @author Tobias
 * @version 20.10.2018
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
		/**
		 * In diesem Konstruktor wird das neue SecretAlphabet gesetzt.
		 * @param s1 bekommt das SecretAlphabet
		 */
		public SubstitutionCipher(String s1) {
			setSecretAlphabet(s1);
		}
		/**
		 * diese Methode setzt dann das neue SecretAlphabet
		 * @param s1 neues Verschlüsselungsalphabet
		 */
		public void setSecretAlphabet(String s1) {
			super.setSecretAlphabet(s1);
		}
}
