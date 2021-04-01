import java.util.Scanner;
public class hasNextInt; 
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        double startBal;
        double withDrawAmount;
        double depositAmount;
        
        System.out.println("Please enter the starting balance for the account: ");
        startBal = in.nextDouble();
        System.out.println("Please enter the interest percentage of the balance: ");
        interestPct = in.nextDouble();
        System.out.println("Please enter the amount that you would like to withdraw from your account: ");
        withDrawAmount = in.nextDouble();
        System.out.println("Please enter the amount that you would like to deposit into your account: ");
        depositAmount = in.nextDouble();
        System.out.println("If you want me to generate interest, enter 'Yes': ");

        
        
        
		BankAccount myBankAccount = new BankAccount(startBal);
		myBankAccount.withdraw(withDrawAmount);
		myBankAccount.deposit(depositAmount);
		myBankAccount.interest(interestPct);
		
		System.out.println("Your total balance now is: " + myBankAccount.getBalance());
		System.out.println("Enter the opening balance: ");
		Scanner in = new Scanner (System.in);
		double  opening = in.nextDouble();
		double threshold=1500;
		double month = 0;
		System.out.println("Enter the interest rate: ");
		double rate= in.nextDouble();

		while (opening <= threshold)
		{

		double  c = rate*opening;
		  opening = opening + c;
		if (opening < 1500)
		{
		System.out.println("");
		System.out.printf(" your balance %.2f", opening);
		month++;
		}
		}
		System.out.println(" ");
		System.out.println("month "+ month);

		}

		}

		
	}


