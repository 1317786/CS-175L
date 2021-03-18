import java.time.*; 
import java.util.Scanner;

import javax.swing.JOptionPane; 

public class ageCalc
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 

	  String dob = in.next(); 
	  LocalDate dateOfBirth = LocalDate.parse(dob); 
      LocalDate currDate = LocalDate.now(); 
 
	  Period period = Period.between(currDate, dateOfBirth); 

	  int age  = Math.abs(period.getYears()); 
        
	  JOptionPane.showInputDialog("Date of Birth: " + dob); 
	  JOptionPane.showInputDialog("Today's Date: " + currDate); 
	  JOptionPane.showInputDialog("You are " + age + " years old!"); 
	}
}
