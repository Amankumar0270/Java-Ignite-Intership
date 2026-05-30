import java.util.Scanner;
public class SUMUntilNegative {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        while (true) {

            System.out.print("Enter number: ");
            num = sc.nextInt();

            if (num < 0) {
                break;
            }

            sum = sum + num;
        }

        System.out.println("Final Sum = " + sum);
        
        sc.close();

	}

}
