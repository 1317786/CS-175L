import java.util.ArrayList;
import java.util.Scanner;


public class BankAccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner in = new Scanner(System.in);


		ArrayList<BankAccount> accountList= new ArrayList<>();
		
		Employee gil = new Employee("Gil", "$500.00");
	    Employee joe = new Employee("Joe", "$1000.00");
	    Employee fred = new Employee("Fred", "$2000.00");
	    Employee sally = new Employee("Sally", "$2500.00");


	    ArrayList<BankAccount> accounts;
		BankAccount employee1;
		accounts.add(employee1);
	    BankAccount employee2;
		accounts.add(employee2);
	    BankAccount employee3;
		accounts.add(employee3);
	    BankAccount employee4;
		accounts.add(employee4);


	    int customerID=4;
	    String choice;
	    int deposit;
	    int withdraw;
	    Employee operation = new Employee();
	    boolean flag = true;

	    String accountType;
	    String currencyType;
	    int balance;

	    while(flag){
	      System.out.println("Select a choice:");
	      System.out.println("1. Existing customer");

	      String input = in.next();

	        if(input.equals("1")){

	          System.out.println("Enter Employee ID: ");
	          customerID = in.nextInt();
	          
	           }
	         }
           }
          }

