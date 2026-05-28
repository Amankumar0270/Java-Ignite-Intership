import java.util.Scanner;
public class Odd_or_Even {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER:\n");
		int num =sc.nextInt();

		if (num%2==0) {
			System.out.println("YOUR GIVEN NUMBER IS EVEN !!");
		}
		else {
			System.out.println("YOUR GIVEN IS ODD!!");
		}
		
           sc.close();
	}

}
