package JavaIgniteDay2;
import java .util.Scanner;
public class movieticket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      System.out.println("******* WELCOME TO MY MOVIE TICKET BILL CALCULATOR *******");
      System.out.println("Enter the name of the movie:");
      String name1=sc.next();
      System.out.println("enter the movie tickect price for one person:");
     int  num2=sc.nextInt();
     System.out.println("enetr ther number of the person :");
     int num3=sc.nextInt();
     float total = num2*num3;
     System.out.println("******* TICKET BILL *******");
     System.out.println("movie :"+name1);
     System.out.println("Ticket price :"+num2);
     System.out.println("number of person :"+num3);
     System.out.println("************************");
     System.out.println("Total bill is :"+total);
     System.out.println("************************");
     System.out.println("!!!!!THANK YOU !!!!");
     
     sc.close();
     

	}

}
