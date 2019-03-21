import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// This class reads multiple lines from a file and checks whether each line of text is a valid password
public class PasswordChecker {
	
	String path = "C:\\Users\\Rafsan\\Documents\\New folder\\passwords.txt";
	String message = "";
	String v = "false";
	String validity = "valid";
	int counter = 0;
	
	public void passwordVerification() {
	
	try {
		
		File file = new File(path);
		FileReader fs = new FileReader(file);
		BufferedReader br = new BufferedReader(fs);
		message = br.readLine();
		Checkers c = new Checkers();
		
		while(message != null) {
			
		if(c.alphabetChecker(message).equals(v)) {
			
			LetterException l = new LetterException(message);
			System.out.println(l.toString());
			validity = "invalid";
		}
		
		if (c.numberChecker(message).equals(v)) {
			
			NumberException n = new NumberException(message);
			System.out.println(n.toString());
			validity = "invalid";
		}
		
		if (c.specialCharsChecker(message).equals(v)) {
			
			SpecialCharException s = new SpecialCharException(message);
			System.out.println(s.toString());
			validity = "invalid";
		}
		
		message = br.readLine();
		
		}
		
		br.close();
		
	    } catch (FileNotFoundException e) {
			
			e.printStackTrace();
		
		} catch (IOException i) {
			
			i.printStackTrace();
		}
		
	    System.out.print("Passwords are " + validity);
		
		}

}
