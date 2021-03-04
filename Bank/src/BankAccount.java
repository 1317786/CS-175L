
/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
	
	public String interestPct; 
	
   private double balance;
   
   
   private double interest;

   
   public void interest(double interestPct);
   {
	   balance = balance * interestPct;
   }
   /**
      Constructs a bank account with zero balance.
 * @param startBal 
   */
   public BankAccount(double startBal)
   {
      balance = startBal;
   }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double depositAmount)
   {
      balance = balance + depositAmount;
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double withDrawAmount)
   {
      balance = balance - withDrawAmount;
   }
   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }
}
