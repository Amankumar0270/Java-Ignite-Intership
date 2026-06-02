
public class Batsman {

    String playerName;
    int runs;
    int balls;
    double strikeRate;

    Batsman(String pn, int r, int b) {

        playerName = pn;
        runs = r;
        balls = b;

      
        strikeRate = (runs * 100.0) / balls;
    }

 
    void display() {

        System.out.println("Player Name : " + playerName);
        System.out.println("Runs : " + runs);
        System.out.println("Balls : " + balls);
        System.out.println("Strike Rate : " + strikeRate);
    }

    public static void main(String[] args) {

        Batsman b1 = new Batsman("Gill", 75, 50);

        b1.display();
    }
}