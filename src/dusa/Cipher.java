package dusa;

public interface Cipher {
	//legt fest wie die Syntax der zwei Methoden 1)encrypt und 2)decrypt aussieht
	public String encrypt(String text);
	public String decrypt(String text);
}
