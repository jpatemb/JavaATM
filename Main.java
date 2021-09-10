import java.util.Scanner;


public class Main {

	public static void atm() {
		float balance = 1000, withdraw, deposit;
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("Automated Teller Machine (ATM)");
			System.out.println("Please select a number below for an operation you want to perform:");
			System.out.println("1 (Withdrawal)");
			System.out.println("2 (Deposit)");
			System.out.println("3 (Check Balance)");
			System.out.println("4 (Exit)");
			
			int select = s.nextInt();
			switch(select) {
			case 1:
				System.out.println("Enter money to be withdrawn:");
				
				withdraw = s.nextFloat();
				
				if(balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money.");
				}
				else {
					System.out.println("Insufficient funds.");
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter money to be deposited:");
				
				deposit = s.nextFloat();
				
				balance = balance + deposit;
				System.out.println("Your money has been successfully deposited!");
				
			case 3:
				System.out.println("Balance " + balance);
				System.out.println("");
				break;
				
			case 4:
				System.exit(0);
				
			s.close();
			
			}
		}
	}
	
	

}
