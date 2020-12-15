import java.lang.management.PlatformLoggingMXBean;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int chosennum = rand.nextInt(11);
        int userguess = 0;
        boolean PlayAgain = true;
                while (PlayAgain == true) {
                    Character PlayAgainQuestion = 'Y';

                    System.out.println("\n===============================\nWelcome to Guess The Number!\n===============================\n Enter your guess?");
                    while (userguess != chosennum) {
                        userguess = scan.nextInt();
                        if (userguess < chosennum) System.out.println("Sorry Chief, that aint it, too low, try again");
                        if (userguess > chosennum) System.out.println("Sorry Chief, that aint it, too high try again");
                        if (userguess == chosennum) break;
                    }
                    System.out.println("\n===============================\nYou guessed it chief, congratulations!");
                    System.out.println("\n===============================\nWould You like to play again? (Y/N)");
                    PlayAgainQuestion = scan.next().charAt(0);
                    if(PlayAgainQuestion == 'N'){
                        PlayAgain = false;
                    }else if(PlayAgainQuestion == 'Y'){
                        PlayAgain = true;
                    }
                    if(PlayAgain == false){
                        break;
                    }
                    chosennum = rand.nextInt(11);
                }
                System.out.println("Thanks For Playing!");
    }
}
