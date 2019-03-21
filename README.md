# Password-Verifier
Java application tha reads multiple passwords from a text file and checks whether they are valid passwords if they meet specific conditions.
The application contains 6 different classes. 

1.Checkers
This class contains three different methods that check three different contraints of the user password.
The first method number_checker checks whether the password has a number in it.
The second method alphabetChecker checks whether the password has alphabets in it. 
The third method specialCharChecker checks whether the password has certain special characters in it. 
All these methods return a string that contains either "true" or "false"

2. Exceptions
The three classes that belong to this criteria are LetterException, NumberException, and SpecialCharException.
Each of these classes generates a custom made exception. LetterException class generates an exception when
the password does not have a letter. The other two classes follow suit except instead of checking for letters
they check Numbers or Special Characters according to their name.

3. PasswordChecker
This is the class where the main processes occur. The file is read and the conditions of the passwords are
checked inside this class. The method passwordVerifier does all this heavy lifting. Inside the method an
instance of the Checkers object is created which allows all the verfication methods inside the checkers class 
to be used on the password being read from the text file. Multiple exception statements are used.

4. Test
This class is where all the testing occurs. testing can be done using two simple steps. First initialize thee
object class PasswordChecker and then call the method passVerification(). This will execute the program and 
produce outputs. This test class abstracts all the complex code of the application and allows the tester to 
test the system using different inputs without having to know how the system works. 

5. How to run the program 
The program requires a text file to be saved at a directory chosen by the user. It could be saved in desktop also.
Then the path of the file is copied and pasted in line 10 of the PasswordChecker class in the path variable.
User can then paste this text: 
*as=Hdflv
7234243&*
{=5Y9Y7qo
Y1{4?9Tff
05-;4uLZb
.)814WynN
72V$V5jn%
58.,3USfv
3{5;9OCnd
:Q%85pGi1
/?92QL4sp
(%6PiX61p
295+_OIun

in the text file, save the file and run the program. User can use their own custom made passwords to check the 
validity of the system. 
