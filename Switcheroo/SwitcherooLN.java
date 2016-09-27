/**
* Program Name:         SwitcherooLN.java
* Program Purpose:      Switch around the letters in a given word ("race").
* Date Created:         8/29/2016
* Last Modified:        9/1/2016
*
* @author       Liam Nickell
* @version      1.2.0
*/

import java.util.*;

public class SwitcherooLN {

    public static void switcheroo() {
        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();
        userResponse = userResponse.toLowerCase();

        if(userResponse.equals("race")) {
            System.out.println(userResponse = userResponse.replace("c", "z"));
            System.out.println(userResponse = userResponse.replace("z", "t"));
            System.out.println(userResponse = userResponse.replace("e", "s"));
            System.out.println(userResponse = userResponse.replace("r", "c"));
            System.out.println(userResponse = userResponse.replace("a", "u"));
            System.out.println(userResponse = userResponse.replace("s", "e"));
            System.out.println(userResponse = userResponse.replace("t", "b"));
            System.out.println(userResponse = userResponse.replace("c", "t"));
            System.out.printf("The internet is a large series of %ss.\n", userResponse);
        } else {
            System.out.println("Didn't I just tell you \"race\" is all I do? Anything" 
                                                    + " else is above my paygrade, you dip.");
        }
    }

    public static void main(String args[]) {
        System.out.println("Type a four letter word. I'll rearrange it."
                                                + " It has to be \"race\" though. That's all I do.");
        switcheroo();
    }

}