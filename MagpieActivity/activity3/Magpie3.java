/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @author Liam Nickell
 * @version 9/26/2016
 */

public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public static void main(String[] args) {
		findKeyword("She's my sister", "sister", 0);
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		} 
		// else if (findKeyword(statement, "dog") >= 0
		// 		|| findKeyword(statement, "cat") >= 0) 
		// {
		// 	response = "Tell me more about your pets.";
		// } 
		// else if (findKeyword(statement, "goudy")) 
		// {
		// 	response = "She is a very good teacher.";
		// } 
		// else if (findKeyword(statement, "esd") >= 0) 
		// {
		// 	response = "Please don't use me to cheat on membean. #HRI";
		// } 
		// else if (findKeyword(statement, "car") >= 0) 
		// {
		// 	response = "You sound like one of those ricers."
		// 	           + " You know, one of those kids that" 
		// 	           + " lower their cars and put flame decals"
		// 	           + " on the side to \"make it go faster?\"";
		// } 
		// else if (findKeyword(statement, "food") >= 0) 
		// {
		// 	response = "You're making me hungry.";
		// }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private static int findKeyword(String statement, String goal,
					int startPos)
	{
		// Trim input statement (remove leading+trailing whitespace)
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		// Convert trimmed input statement to lowercase and then get
		// the index of goal input (lowercase) from startPos (default: 0)
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		// While position is greater than or equal to 0 (there is 
		// still a match of goal in the statement input), check for
		// if the letters before and after the goal input are letters
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			// If position is past position 0 of input statement
			if (psn > 0)
			{
				// Set before to character directly before input 
				// statement (as lowercase)
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();

				System.out.println("before: " + before);
			}
			// If position plus length of goal input is less than
			// length of phrase
			if (psn + goal.length() < phrase.length())
			{
				// Set after to character directly after end of 
				// input statement (as lowercase)
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();

				System.out.println("after: " + after);
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				System.out.println("return psn: " + psn);

				// Returns a number for psn instead of -1
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

			System.out.println("next psn: " + psn);
		}

		// Goal not found
		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private static int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
