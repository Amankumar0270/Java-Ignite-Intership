import java.util.Scanner;
public class StudentGrade_Evaluator {
	
	static String predictor(int marks){
		if(marks>=70) {
			return"A GRADE";
		}
		else if(marks>=50) {
			return"B GRADE";
		}
		else if(marks>=45) {
			return" C GRADE";
		}
		else {
			return"Fail";
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your marks :");
		int marks=sc.nextInt();
		String result=predictor(marks);
		System.out.println(result);
		

	}

}
