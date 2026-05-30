import java.util.Scanner;
public class Even_without_If {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
	int i=2;
	while(i<n) {
		System.out.println(i);
		i=i+2;
	}
sc.close();

	}

}
