
// This class checks whether a string has digits, alphabets and certain special characters in it
public class Checkers {
	
	// Checks if the string n has a number in it
	public String numberChecker(String n) {
		int len = n.length();
		String bool = "";
		for (int i = 0; i<len; i++) {
			if (n.charAt(i) >= '0' && n.charAt(i)<= '9') {
				bool = "true";
				break;
			}else {
				bool = "false";
			}
			
		}
		
		return bool;
	}
	
	// Checks if the string n has a alphabet in it
	public String alphabetChecker(String n) {
		int len = n.length();
		String bool = "";
		for(int y = 0; y<len; y++) {
			if(n.charAt(y)>= 'a' && n.charAt(y) <= 'z') {
				bool = "true";
				break;
			}else {
				bool = "false";
			}
			
		}
		
		return bool;
	}
	
	// Checks if the string n has special characters in it
	public String specialCharsChecker(String n) {
		int len = n.length();
		String bool = "";
		
		for ( int z = 0; z < len; z++) {
			if (n.charAt(z) == '!' || n.charAt(z) == '@' || n.charAt(z) == '#') {
				bool = "true";
				break;
			}else {
				bool = "false";
			}
			
		}
		
	    return bool;
	}

}
