/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String lowerCaseStatement = statement.toLowerCase();
		String response = "";

		if (lowerCaseStatement.indexOf(" no ") >= 0) {
			response = "Why so negative?";
		} else if (lowerCaseStatement.indexOf(" mother ") >= 0
				|| lowerCaseStatement.indexOf(" father ") >= 0
				|| lowerCaseStatement.indexOf(" sister ") >= 0
				|| lowerCaseStatement.indexOf(" brother ") >= 0) {
			response = "Tell me more about your family.";
		} else if (lowerCaseStatement.indexOf(" dog ") >= 0
				|| lowerCaseStatement.indexOf(" cat ") >= 0) {
			response = "Tell me more about your pets.";
		} else if (lowerCaseStatement.indexOf(" goudy ")) {
			response = "She is a very good teacher.";
		} else if (lowerCaseStatement.indexOf(" esd ") >= 0) {
			response = "Please don't use me to cheat on membean. #HRI";
		} else if (lowerCaseStatement.indexOf(" car ") >= 0) {
			response = "You sound like one of those ricers."
			           + " You know, one of those kids that" 
			           + " lower their cars and put flame decals"
			           + " on the side to \"make it go faster?\"";
		} else if (lowerCaseStatement.indexOf(" food ") >= 0) {
			response = "You're making me hungry.";
		} else {
			response = getRandomResponse();
		}

		if(lowerCaseStatement.trim().equals("")) {
			response = "Please say something to me."
		}

		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Wow, I never thought about that.";
		} else if (whichResponse == 5) {
			response = "Oh my.";
		}

		return response;
	}
}
