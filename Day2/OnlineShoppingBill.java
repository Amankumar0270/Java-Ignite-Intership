package JavaIgniteDay2;
import java.util.Scanner;
public class OnlineShoppingBill {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Customer Name:");
	        String customerName = sc.nextLine();

	        System.out.println("Enter Product Name:");
	        String productName = sc.nextLine();

	        System.out.println("Enter Product Price:");
	        int price = sc.nextInt();

	        System.out.println("Enter Quantity:");
	        int quantity = sc.nextInt();

	        int totalBill = price * quantity;

	        System.out.println("\n----- BILL DETAILS -----");
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Product Name  : " + productName);
	        System.out.println("Price         : " + price);
	        System.out.println("Quantity      : " + quantity);
	        System.out.println("Total Bill    : " + totalBill);

	        sc.close();

	}

}
