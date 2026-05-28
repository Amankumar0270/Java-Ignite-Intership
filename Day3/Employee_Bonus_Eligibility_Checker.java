import java.util.Scanner;
public class Employee_Bonus_Eligibility_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter years of experience: ");
	        int years = sc.nextInt();

	        System.out.print("Enter attendance percentage: ");
	        double attendance = sc.nextDouble();

	        System.out.print("Enter performance rating (1-5): ");
	        int rating = sc.nextInt();

	        // Immediate rejection condition
	        if (attendance < 60) {
	            System.out.println("Not Eligible");
	            System.out.println("Bonus Rejected due to low attendance");
	        }
	        else if (years > 3 && attendance > 85) {

	            System.out.println("Eligible");

	            if (rating == 5) {
	                System.out.println("Bonus Amount = ₹50000");
	            }
	            else if (rating == 4) {
	                System.out.println("Bonus Amount = ₹30000");
	            }
	            else if (rating == 3) {
	                System.out.println("Bonus Amount = ₹10000");
	            }
	            else {
	                System.out.println("No Bonus");
	            }

	        }
	        else {
	            System.out.println("Not Eligible");
	        }

	        sc.close();

	}

}
