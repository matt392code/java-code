Picture of Small Java program using regular expressions
// This program will test regular expresssions
// on a file that the user inputs at the program's request.
// Distributed under the GNU GPL: www.gnu.org

import java.io.*;
import java.util.regex.*;

public class regex1 {
public static void main(String args[]) throws IOException {
  String userEntry;

  // Ask user to enter data into program that will be matched
  // against the regex

  InputStreamReader delta = new InputStreamReader(System.in);
  BufferedReader echo = new BufferedReader(delta);
  System.out.println("Enter data to be matched against regex.");
  userEntry = echo.readLine();

  String golf = new String("Linux|FreeBSD|linux|freebsd");
  Pattern alpha = Pattern.compile(golf);
  Matcher bravo = alpha.matcher(userEntry);
  boolean charlie = bravo.matches();
 
  System.out.println("Is it a match? " + charlie);



} // end main method
}  // end class regex1
