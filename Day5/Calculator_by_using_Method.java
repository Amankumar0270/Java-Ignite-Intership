import java.util.Scanner;
public class Calculator_by_using_Method {
	static int  addition(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	
	}
	static int subtraction(int num1,int num2) {
		int sub =num1-num2;
		return sub;
	}
	static int multiplication(int num1 ,int num2) {
		int mul = num1*num2;
		return mul;
	}
	static int division (int num1,int num2) {
		int div = num1/num2;
		return div;
	}
	static int modulus(int num1 , int num2 ) {
		int mod= num1%num2;
		return mod;
	}

	public static void main(String[] args) {
		System.out.println (" !!! ***** WELCOME TO THE CALCULATR ***** !!!!");
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two  numbers :");
		int num1 = sc.nextInt();
		int num2=sc.nextInt();
		
		// function calling 
		
		System.out.println(" ******______!!!!!!->>> GIVE YOUR PREFERENCE WHAT YOU WANT TO CALCULATE->>>  ******_____ !!!!!!");
		
		while(true ) {
			
			System.out.println("\n 1. Addition  \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n 6. exit  \n");
			System.out.println("******************");
			System.out.println("Enter  your  choice :");
			int num =sc.nextInt();
			switch(num) {
			case 1:
				int ans1=addition(num1, num2);
				System.out.println("Addition is :" + ans1);
				break;
			case 2:
				int ans2=subtraction(num1,num2);
				System.out.println("Subtraction  is :" + ans2);
				break;
				
			case 3:
				int ans3=multiplication(num1,num2);
				System.out.println("Multiplication  is :" + ans3);
				break;
				
			case 4:
				int ans4=division(num1,num2);
				System.out.println("Division is : " + ans4);
				break;
				
				
			case 5:
				int ans5=modulus(num1,num2);
				System.out.println("Modulus is : " + ans5);
				
				break;
				
			case 6:
				System.exit(0);
			
			default:
				System.out.println(" !!! Invalid choice you entered !!!");
				
				
			}
			
		}
		

	}

}
