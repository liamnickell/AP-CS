import java.util.*;

public class HelloWorld {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you like life? (yes/y or no/n)");
        String userResponse = input.next();

        if(userResponse.equals("yes") || userResponse.equals("y")){
            System.out.println("Hello World!");
        } else if(userResponse.equals("no") || userResponse.equals("n")){
            System.out.println("Hello eternal void and existensial dread!");
        } else {
            System.out.println("Nice try, loser.");
        }
    }

}