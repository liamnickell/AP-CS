// In progress...

import java.util.*;

public class HiLoLN {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean userIsPlaying = true;

        System.out.println("I will generate a random number between 1 and "
                            + "100 and you will try to guess in as few "
                            + "guesses as possible. I will tell you whether "
                            + "your guess is too high or too low. Type \'q\' "
                            + "to exit the game.");
        while(userIsPlaying) {
            int randomNum = (int)(Math.random() * 100) + 1;
            int guesses = 0;
            boolean newGame = false;

            while(userIsPlaying && !newGame) {
                String response = scan.nextLine();

                if(response.equals("q")) {
                    System.out.println("Ok, quitting...");
                    userIsPlaying = false;
                } else if(Integer.parseInt(response) > randomNum) {
                    System.out.println("Too high!");
                    guesses++;
                } else if(Integer.parseInt(response) < randomNum) {
                    System.out.println("Too low!");
                    guesses++;
                } else {
                    System.out.println("You got it!");
                    System.out.printf("That took you %d guesses.\n", guesses);
                    System.out.println("Want to play again?");
                    response = scan.nextLine();

                    if(response.equals("yes") || response.equals("y")) {
                        System.out.println("Okay! Starting new game...");
                        newGame = true;
                    } else {
                        System.out.println("Ok, quitting...");
                        userIsPlaying = false;
                    }
                }
            }
        }
        
    }
    
}