import java.util.Scanner;

public class Foodmenu {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    // SWITCH CASE

	    System.out.println("ENTER YOUR DAY (1 to 4):");
	    int day =sc. nextInt();
	    switch(day){
	        case 1:
	            System.out.println("PIZZA");
	            break;
	        case 2:
	            System.out.println("BURGER");
	            break;
	        case 3:
	            System.out.println("JUICE");
	            break;
	        case 4:
	            System.out.println("ICECREAM");
	            break;
	         default  :
	            System.out.println("your choice is Invalid !!");


	    }
	    sc.close();


	}

}
