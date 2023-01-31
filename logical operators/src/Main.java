import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("you are playing a game. olease enter q or Q to quit");
        String response = scanner.next();

        if(!response.equals("q") && !response.equals("Q")){

            System.out.println("you are still playig the game");

        }
        else{
            System.out.println("quitter");

        }
    }
}