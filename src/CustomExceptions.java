
public class CustomExceptions{
	
	public class LetterException extends Exception {
		String message;
		public LetterException(String n) {
			this.message = n;
		}
		
		public String toString() {
			return  ("Letter Exception: " + message);
		}

	}
	
	public class SpecialCharException extends Exception {
		String message;
		public SpecialCharException(String n) {
			this.message = n;
		}
		
		public String toString() {
			return  ("Special Character Exception: " + message);
		}

	}
	
	public class NumberException extends Exception {
		String message;
		
		public NumberException(String n) {
			this.message = n;
		}
		
		public String toString() {
			return  ("Number Exception: " + message);
		}

	}


}
