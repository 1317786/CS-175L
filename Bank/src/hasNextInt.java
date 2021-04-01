import java.util.Scanner;
public class hasNextInt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a threshold: ");
		while (in.hasNextDouble())
		{int months = 0;
			double numb = in.nextDouble();
			//System.out.println(numb);
			while (acct.getBalance() < numb)
			{acct.calcInterest()
				months++;
			}
			System.out.println(months);
		}
		
		

	}

}