package JavaIgniteDay2;
import java.util.Scanner;
public class TravelExpensesEstimator {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Travel Distance (KM):");
        float distance = sc.nextFloat();

        System.out.println("Enter Petrol Price Per Liter:");
        float petrolPrice = sc.nextFloat();

        System.out.println("Enter Vehicle Mileage (KM per Liter):");
        float mileage = sc.nextFloat();

        float petrolNeeded = distance / mileage;
        float totalCost = petrolNeeded * petrolPrice;

        System.out.println("\n----- TRAVEL DETAILS -----");
        System.out.println("Distance Travelled : " + distance + " KM");
        System.out.println("Petrol Needed      : " + petrolNeeded + " Liters");
        System.out.println("Total Travel Cost  : " + totalCost);

        sc.close();

	}

}
