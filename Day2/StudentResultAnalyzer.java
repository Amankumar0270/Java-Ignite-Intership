package JavaIgniteDay2;
import java.util.Scanner;
public class StudentResultAnalyzer {
public static void main (String[]args) {
	
	Scanner sc = new Scanner(System.in);

    System.out.println("Enter Student Name:");
    String name = sc.nextLine();

    System.out.println("Enter Marks of Subject 1:");
    int sub1 = sc.nextInt();

    System.out.println("Enter Marks of Subject 2:");
    int sub2 = sc.nextInt();

    System.out.println("Enter Marks of Subject 3:");
    int sub3 = sc.nextInt();

    int total = sub1 + sub2 + sub3;
    double average = total / 3.0;

    boolean greaterThan50 = average > 50;

    System.out.println("\n----- RESULT -----");
    System.out.println("Student Name : " + name);
    System.out.println("Total Marks  : " + total);
    System.out.println("Average      : " + average);
    System.out.println("Average > 50 : " + greaterThan50);

    sc.close();
	
}
}


