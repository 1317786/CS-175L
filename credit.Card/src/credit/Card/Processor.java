package credit.Card;
import java.util.Scanner;
public class Processor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a credit card number: ");
		String creditCardNumber = in.nextLine();

		int len = creditCardNumber.length();
		int i = 0;
		String replace = "";

		while (i < creditCardNumber.length())
		{
			char ch = creditCardNumber.charAt(i);
			if (  ch=='-' || ch==' ')
			{
				 replace= creditCardNumber.replaceAll("-" , "").replaceAll(" ", "");

			}
			 
			i++;

		}

		System.out.println(replace);		
			
			}

   }
	


