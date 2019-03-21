
// This class generates a custom made Special Characters Exception
public class SpecialCharException extends Exception {
	String message;
	public SpecialCharException(String n) {
		this.message = n;
	}
	
	public String toString() {
		return  ("Special Character Exception: " + message);
	}

}
