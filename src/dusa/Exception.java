package dusa;

public class Exception extends NumberFormatException{
		/* Der Konstruktor der Exception legt mittels eines Parameters den Ausgabetext fest.
		 * @param s der übergebene Ausgabe-Text
		 */
		public Exception(String s) {
			super(s);
		}
}
