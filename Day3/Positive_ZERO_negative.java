import java.util.Scanner;
public class Positive_ZERO_negative {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THHE NUMBER :");
	int num=sc.nextInt();
	if (num>0) {
		System.out.println("NUMBER IS POSITIIVE");
	}
	else if(num==0) {
		System.out.println("NUMBER IS ZERO ");
		
	}
	else {
		System.out.println("NUMBER IS NEGATIVE ");
	}
	
sc.close();
	}

}
