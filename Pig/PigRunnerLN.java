/**
* Program Name:        PigRunnerLN.java
* Program Purpose:     Runner class for Pig game
* Date Created:        10/26/2016
* Last Modified:       10/30/2016
*
* @author     Liam Nickell
* @version    1.1.2
*/

import java.util.*;

public class PigRunnerLN {

    public static void main(String[] args) {
        PairOfDiceLN pairOfDice = new PairOfDiceLN();
        Scanner scan = new Scanner(System.in);
        boolean userWantsToPlay = true;
        final int WINNING_SCORE = 50;

        System.out.println("/------------------------------------------\\");
        System.out.println("|        /------\\        /-------\\         |");
        System.out.println("|        |      |        |       |         |");
        System.out.println("|        |      |        |       |         |");
        System.out.println("|        |      |   o    |                 |");
        System.out.println("|        |------/        |    |--\\         |");
        System.out.println("|        |          |    |       |         |");
        System.out.println("|        |          |    |       |         |");
        System.out.println("|        |          |    \\-------/         |");
        System.out.println("|                                          |");
        System.out.println("|            By Liam Nickell               |");
        System.out.println("\\------------------------------------------/");
        System.out.println();
        System.out.println("Would you like to play pig? (y/n)");

        if(responseIsNo(scan)) {
            userWantsToPlay = false;
        } else {
            System.out.println("Great! Let's play.");
        }

        while(userWantsToPlay) {
            int userBank = 0;
            int computerBank = 0;

            boolean inGame = true;
            while(inGame) {
                int currentScore = 0;
                boolean userIsStanding = true;
                boolean computerIsStanding = true;

                System.out.println("Starting new round...");
                boolean onRound = true;
                while(onRound) {
                    if(computerIsStanding) {
                        if(((userIsStanding && currentScore >= 14 && Math.random() > 0.6)
                            || (!userIsStanding && currentScore >= 14 && Math.random() > 0.3))
                            && (userBank < 50 || (computerBank >= 50 && userBank <= computerBank))) {
                            System.out.println("The computer decided to sit!");
                            computerIsStanding = false;
                            System.out.println("Adding " + currentScore + " to the computer's bank...");
                            computerBank += currentScore;
                            System.out.println("The computer's bank total is now " + computerBank + ".");
                        } else {
                            System.out.println("The computer wants to stay standing.");
                        }
                    }

                    if(userIsStanding) {
                        System.out.println("Do you want to stay standing? (y/n)");
                        if(responseIsNo(scan)) {
                            userIsStanding = false;
                            System.out.println("Adding " + currentScore + " to your bank...");
                            userBank += currentScore;
                            System.out.println("Your bank total is now " + userBank + ".");
                        }
                    }

                    if(userIsStanding || computerIsStanding) {
                        pairOfDice.roll();
                        if(pairOfDice.getD1Value() == 1 && pairOfDice.getD2Value() == 1) {
                            System.out.println("Snake eyes! All standing players' banks go to zero.");
                            if(userIsStanding) {
                                userBank = 0;
                            }
                            if(computerIsStanding) {
                                computerBank = 0;
                            }
                            onRound = false;
                        } else if(pairOfDice.getD1Value() == 1 || pairOfDice.getD2Value() == 1) {
                            System.out.println("A one was rolled! All standing players gain nothing.");
                            onRound = false;
                        } else {
                            currentScore += pairOfDice.getTotal();
                            System.out.println("The roll was " + pairOfDice.getTotal() + "."
                                                + " The round score is now " + currentScore + ".");
                        }
                    } else {
                        onRound = false;
                    }
                }

                if(userBank >= WINNING_SCORE || computerBank >= WINNING_SCORE) {
                    if(userBank > computerBank) {
                        System.out.println("You win! Your score was " + userBank 
                                            + " and the computer's score was "
                                            + computerBank + ".");
                    } else if(userBank < computerBank) {
                        System.out.println("You lose! Your score was " + userBank
                                            + " and the computer's score was "
                                            + computerBank + ".");
                    } else if(userBank == computerBank) {
                        System.out.println("It is a tie! Both your score and the "
                                            + "computer's score is " + userBank + ".");
                    }

                    inGame = false;
                }
            }

            System.out.println("Do you want to play again? (y/n)");
            if(responseIsNo(scan)) {
                userWantsToPlay = false;
            } else {
                System.out.println("Great! Let's play.");
            }
        }

        System.out.println("Okay, bye bye!");
    }

    /**
    * Method purpose: Check if user response is a no
    *
    * @param  scan  Scanner object to be used when scanning next line
    * @return true if there is a n/no in scan.nextLine()
    */
    public static boolean responseIsNo(Scanner scan) {
        String response = scan.nextLine();
        return response.indexOf("n") > -1 || response.indexOf("no") > -1;
    }

}