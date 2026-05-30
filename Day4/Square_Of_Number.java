import java.util.Scanner;
public class Square_Of_Number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Print he square of the number from the 1 to 20");
	int i=1;
	for(i=1;i<=20;i++) {
		
		int sq=i*i;
		System.out.println(sq);
	}
	
sc.close();
	}

}
