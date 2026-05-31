import java.util.Scanner;
public class Square_of_number {
	// no return type  but  with parameter 
static void square(int n) {
	int ans =n*n;
	System.out.println("result is :" + ans );
}
// return type with the parameter 


static int Square_of_number(int n){
	return n*n;
	
}
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter your number :");
		int n=sc.nextInt();
		
		// this is the function call with the  void condition //
		square(n);
		
		
		// This for the second method 
		
		
		System.out.println(" !! both are the different !!");
		
		int result =Square_of_number(n);
		System.out.println("The square of the given number is :" + result );
		
		

		sc.close ();
	}

}
