import java.util.Scanner;

public class Ass01_RockPaperScissors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain = "";
        String playerA = "";
        String playerB = "";

        do {
            // Get valid move for player A
            System.out.println("Enter your move Player A: R for Rock, P for Paper, S for Scissors.");
            playerA ="";
            while (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S"))) {
                playerA = in.next().toUpperCase();
                if (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S"))) {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }

            // Get valid move for player B
            System.out.println("Enter player B's move (R for Rock, P for Paper, S for Scissors):");
            playerB = "";
            while (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S"))) {
                playerB = in.next().toUpperCase();
                if (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S"))) {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }

            // Determine winner
            if (playerA.equals(playerB)) {
                System.out.println("It's a tie! Both players chose " + playerA);
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                System.out.println("Player A wins!");
            } else {
                System.out.println("Player B wins!");
            }

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? (Y/N):");
            playAgain = in.next();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
        in.close(); // Close the scanner when done
    }
}