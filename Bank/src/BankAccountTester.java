import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        double startBal;
        double withDrawAmount;
        double depositAmount;
        
        System.out.println("Please enter the starting balance for the account: ");
        startBal = in.nextDouble();
        System.out.println("Please enter the amount that you would like to withdraw from your account: ");
        withDrawAmount = in.nextDouble();
        System.out.println("Please enter the amount that you would like to deposit into your account: ");
        depositAmount = in.nextDouble();

        
        
        
		BankAccount myBankAccount = new BankAccount(startBal);
		myBankAccount.withdraw(withDrawAmount);
		myBankAccount.deposit(depositAmount);
		System.out.println("Your total balance now is: " + myBankAccount.getBalance());
		
	}

}
