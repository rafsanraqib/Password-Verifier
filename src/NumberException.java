
// This class generates a custom made Number Exception
public class NumberException extends Exception {
	String message;
	
	public NumberException(String n) {
		this.message = n;
	}
	
	public String toString() {
		return  ("Number Exception: " + message);
	}

}
