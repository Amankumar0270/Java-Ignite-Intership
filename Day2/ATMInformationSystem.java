package JavaIgniteDay2;
import java.util.Scanner;
public class ATMInformationSystem {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String name = sc.nextLine();

        System.out.println("Enter Account Balance:");
        float balance = sc.nextFloat();

        System.out.println("Enter Withdrawal Amount:");
        float withdraw = sc.nextFloat();

        float remainingBalance = balance - withdraw;

        System.out.println("\n----- ATM DETAILS -----");
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Balance     : " + balance);
        System.out.println("Withdrawal Amount   : " + withdraw);
        System.out.println("Remaining Balance   : " + remainingBalance);

        // Bonus
        boolean sufficientBalance = balance >= withdraw;
        System.out.println("Sufficient Balance? : " + sufficientBalance);

        sc.close();

	}

}
