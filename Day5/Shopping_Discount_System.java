import java.util.Scanner;
public class Shopping_Discount_System {
static double Shopping(double amount ,double discount) {
	 
		 double bill= amount-(amount*discount)/100;
		 return bill;
}
	public static void main(String[] args) {
		System.out.println(">><<---------WELCOME TO SHOPPING_DISCOUNT_SYSTEM--------->><<");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your amount :");
		double amount = sc.nextDouble();
		System.out.println("Enter your discount :");
		double discount =sc.nextDouble();
		
		
		double  res =Shopping(amount,discount);
		
		System.out.println("**************************");
		System.out.println("final_bill :  " + res);
		System.out.println("***************************");
		
		sc.close();

	}

}
