import java.util.Scanner;
public class Largest_of_Two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR TWO NUMBERS:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
	
		//  compare the given number 
		
		if (num1>num2) {
			System.out.println(" !! first number is greatest !!");
		}
		else {
			System.out.println("!! second number is the greatest !!");
		}
		sc.close();

	}

}
