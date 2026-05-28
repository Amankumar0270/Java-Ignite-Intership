import java.util.Scanner;
public class Restaurant_Ordering_System {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int price = 0;

        System.out.println("Main Menu");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");

        System.out.print("Enter choice: ");
        int mainChoice = sc.nextInt();

        switch (mainChoice) {

            case 1:

                System.out.println("Veg Menu");
                System.out.println("1. Fried Rice - ₹150");
                System.out.println("2. Noodles - ₹120");

                System.out.print("Enter item choice: ");
                int vegChoice = sc.nextInt();

                if (vegChoice == 1) {
                    price = 150;
                }
                else if (vegChoice == 2) {
                    price = 120;
                }
                else {
                    System.out.println("Invalid Selection");
                   
                }

                break;

            case 2:

                System.out.println("Non-Veg Menu");
                System.out.println("1. Chicken Biryani - ₹250");
                System.out.println("2. Grill Chicken - ₹400");

                System.out.print("Enter item choice: ");
                int nonVegChoice = sc.nextInt();

                if (nonVegChoice == 1) {
                    price = 250;
                }
                else if (nonVegChoice == 2) {
                    price = 400;
                }
                else {
                    System.out.println("Invalid Selection");
                   
                }

                break;

            default:
                System.out.println("Invalid Selection");
           
        }

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        double total = price * qty;

        sc.nextLine();

        System.out.print("Enter member status (Gold/Silver/Normal): ");
        String member = sc.nextLine();

        double discount = 0;

        if (member.equalsIgnoreCase("Gold")) {
            discount = total * 0.20;
        }
        else if (member.equalsIgnoreCase("Silver")) {
            discount = total * 0.10;
        }

        double finalBill = total - discount;

        System.out.println("Total Bill = ₹" + finalBill);

        if (finalBill > 2000 && member.equalsIgnoreCase("Gold")) {
            System.out.println("Free Dessert Available!");
        }

        sc.close();
	}

}
