import java.util.Scanner;
public class ATMRetry {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        int correctPin = 1234;
	        int pin;

	        while (true) {

	            System.out.print("Enter ATM PIN: ");
	            pin = sc.nextInt();

	            if (pin == correctPin) {
	                System.out.println("PIN Correct. Access Granted.");
	                break;
	            } else {
	                System.out.println("Wrong PIN. Try Again.");
	            }
	        }
	        sc.close();

	}

}
