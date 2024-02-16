import java.util.Scanner;

public class Ass01_RockPaperScissors
{

    public static void main(String[] args)
    {
        //scanner in
        Scanner in = new Scanner(System.in);
        //declare variables
        String playAgain = "";
        String playerA = "";
        String playerB = "";

        // do while for "play again"
        do {
            playerA = ""; // Reset playerA for a new game
            playerB = ""; // Reset playerB for a new game

            // ask for player a move
            System.out.println("Enter your move Player A: (R)Rock/(P)Paper/(S)Scissors: ");
            // while only allows for RPS input and keeps loop going until it's correct
            while (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S")))
            {
                playerA = in.next().toUpperCase(); //takes input and assigns upperCase form to player A
                // says if player A doesn't equal RPS to print Invalid Input and ask for a new move.
                if (!(playerA.equals("R") || playerA.equals("P") || playerA.equals("S")))
                {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }

            // Get valid move for player B
            System.out.println("Enter your move player B: (R)Rock/(P)Paper/(S)Scissors: ");
            //only allows for RPS input again, keeps whole thing looping
            while (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S")))
            {
                playerB = in.next().toUpperCase();// takes input and assigns uppercase
                if (!(playerB.equals("R") || playerB.equals("P") || playerB.equals("S"))) {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            }

            // Determine winner with cascaded if
            if (playerA.equals(playerB)) {
                System.out.println("It's a tie! Both players chose " + playerA);
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                System.out.println("Player A wins!");
            } else {
                System.out.println("Player B wins!");
            }

            // Ask if the user wants to play again (chance to end do while loop and change boolean to something other than Y)
            System.out.println("Do you want to play again? (Y/N):");
            playAgain = in.next();

//end of do-while from top for game restart
        } while (playAgain.equalsIgnoreCase("Y"));

        in.close(); // Close the scanner when done
    }
}