import java.util.Scanner;
public class Travel_Expense_Calculator {
	
	static double travel_expe(double distance,double mileage,double price) {
		
		   double petrol_needed =distance/mileage;
		   
		  double  travel_cost=petrol_needed*price;
		  return travel_cost;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the distance in (km):");
		double distance = sc.nextDouble();
		System.out.println("Enter the milege in (km/l):");
		double mileage = sc.nextDouble();
		System.out.println("Enter the price of the petrol  in (ruppes):");
		double price = sc.nextDouble();
		
		
		double res= travel_expe(distance ,mileage,price);
		System.out.println("***************************");
		System.out.println("Travel cost :" + res);
		System.out.println("****************************");
		
		
		
		

	}

}
