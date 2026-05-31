import java.util.Scanner;
public class Battle_Arena {
	static String arena_winner(int score1,int score2) {
		if (score1>score2) {
			return"player 1 winner";
		}
		else if (score1==score2){
			return"match is drwa";
		}
		else {
			return "player2 winner";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the score of player 1:");
		int score1= sc.nextInt();
		System.out.println("Enter the score of player 1:");
		int score2 = sc.nextInt();
		
		String result = arena_winner(score1,score2);
		System.out.println(result);
		sc.close();
		
		

	}

}
