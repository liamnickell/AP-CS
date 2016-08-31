import java.util.*;

public class SwitcherooLN {

	public static void switcheroo(double randomNum) {
		Scanner input = new Scanner(System.in);
		String userResponse = input.nextLine();
		userResponse = userResponse.toLowerCase();

		if(userResponse.equals("race") && randomNum < 0.33) {
			System.out.println(userResponse = userResponse.replace("c", "z"));
			System.out.println(userResponse = userResponse.replace("z", "t"));
			System.out.println(userResponse = userResponse.replace("e", "s"));
			System.out.println(userResponse = userResponse.replace("r", "c"));
			System.out.println(userResponse = userResponse.replace("a", "u"));
			System.out.println(userResponse = userResponse.replace("s", "e"));
			System.out.println(userResponse = userResponse.replace("t", "b"));
			System.out.println(userResponse = userResponse.replace("c", "t"));
			System.out.printf("The internet is a large series of %ss.\n", userResponse);
		} else if(userResponse.equals("race") && randomNum < 0.66) {
			System.out.println(userResponse = userResponse.replace("c", "z"));
			System.out.println(userResponse = userResponse.replace("z", "t"));
			System.out.println(userResponse = userResponse.replace("e", "s"));
			System.out.println(userResponse = userResponse.replace("r", "c"));
			System.out.println(userResponse = userResponse.replace("a", "u"));
			System.out.println(userResponse = userResponse.replace("s", "e"));
			System.out.println(userResponse = userResponse.replace("t", "b"));
			System.out.println(userResponse = userResponse.replace("c", "t"));
			System.out.println(userResponse = userResponse.replace("e", "s"));
			System.out.println(userResponse = userResponse.replace("u", "a"));
			userResponse = userResponse.replace("t", "T");
			System.out.printf("%s are better than spaces.\n", userResponse);
		} else if(userResponse.equals("race")) {
			System.out.println(userResponse = userResponse.replace("c", "z"));
			System.out.println(userResponse = userResponse.replace("z", "t"));
			System.out.println(userResponse = userResponse.replace("e", "s"));
			System.out.println(userResponse = userResponse.replace("r", "c"));
			System.out.println(userResponse = userResponse.replace("a", "u"));
			System.out.println(userResponse = userResponse.replace("s", "e"));
			System.out.println(userResponse = userResponse.replace("t", "b"));
			System.out.println(userResponse = userResponse.replace("c", "t"));
			System.out.println(userResponse = userResponse.replace("e", "s"));
			System.out.println(userResponse = userResponse.replace("u", "a"));
			System.out.println(userResponse = userResponse.replace("t", "c"));
			System.out.printf("Why use %s when there's Uber?\n", userResponse);
		} else {
			System.out.println("Didn't I just tell you \"race\" is all I do? Anything" 
													+ " else is above my paygrade, you dip.");
		}
	}

	public static void main(String args[]) {
		System.out.println("Type a four letter word. I'll rearrange it."
												+ " It has to be \"race\" though. That's all I do.");

		double randomNum = Math.random();
		switcheroo(randomNum);
	}

}