import java.util.Scanner;
public class Vote_eligibilty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE AGE OF THE VOTER :");
	int age = sc.nextInt();
	if (age>=18) {
		System.out.println("!! you eligible for the vote !!");
	}
	else {
		System.out.println("!!  not eligible for vote !!");
	}
	
	sc.close();
	}

}
