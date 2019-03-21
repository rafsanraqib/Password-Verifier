
// This class generates a custom made Letter Exception
public class LetterException extends Exception {
	String message;
	public LetterException(String n) {
		this.message = n;
	}
	
	public String toString() {
		return  ("Letter Exception: " + message);
	}

}
