package unl.soc;

import java.util.Scanner;

public class HorseGame {

	//NOTE: these are *member variables* of the class.  You can access
	//      them using the `this` keyword in any of this class's methods.
	//      Example: 
	//         this.revealedLetters = new StringBuilder();
	private StringBuilder revealedLetters;
	private String secretWord;

	public HorseGame() {
		this.secretWord = Dictionary.getRandomWord();
	}

	/**
	 * Starts the game by selecting a random secret word, and tracking player
	 * guesses and invoking methods to display the output.
	 * 
	 * @param wordChoices ArrayList of Strings containing all the possible words to
	 *                    chose a secret one.
	 */
	public void startGame() {

		Scanner askUser = new Scanner(System.in);
		boolean charRevealed;
		boolean won = false;
		int numBadGuesses = 0;

		initializeBlankString();

		System.out.print("Please enter the number of allowed (bad) guesses: ");
		int allowedGuesses = askUser.nextInt();

		printWithSpaces();

		// Game loop tracking the number of right and wrong guesses
		String userGuess;
		do {

			System.out.print("Enter a letter to guess: ");
			userGuess = askUser.next();
			char guess = userGuess.charAt(0);

			charRevealed = revealGuessedLetter(guess);

			won = checkGuess();

			if (!charRevealed) {
				numBadGuesses++;
			}

			drawHorse(numBadGuesses, allowedGuesses);

			printWithSpaces();

		} while (numBadGuesses < allowedGuesses && !won);

		if (won) {
			System.out.println("\nCongratulations!");
			System.out.println("You correctly guessed the word: " + this.secretWord + "!");
		} else {
			System.out.println("\nSorry, you've run out of guesses.");
			System.out.println("The correct word was: " + this.secretWord);
		}

	}

	/**
	 * Sets each char of a StringBuilder equal in length to the secret word to all
	 * blank spaces.
	 * 
	 * @param word A String, the secret word being concealed.
	 */
	private void initializeBlankString() {

		// TODO: Initialize the revealedLetters StringBuilder here;
		//       make it so that revealedLetters consists of *only*
		//       underscores and has the same length as secretWord
		//       Example: if secretWord is "computer", revealedLetters
		//       should be "_______" (8 underscores).
	}

	/**
	 * Prints out the current stage of player progress, showing which letters the
	 * player has guessed correctly.
	 */
	private void printWithSpaces() {

		System.out.println();

		// TODO: Write code to print the content of the revealedLetters
		// StringBuilder here, with each letter separated by a space

		System.out.println();

	}

	/**
	 * Draws a portion of the horse for each wrong guess that the user makes.
	 * Perhaps not essential, but a neat edition to the program.
	 * 
	 * @param guessedSoFar   The number of guesses the user has made.
	 * @param allowedGuesses The total number of permitted guesses.
	 */
	private void drawHorse(int guessedSoFar, int allowedGuesses) {

		String[] horsey = { "    (\\(\\_\\", " _.o o`\\\\\\\\", "('_     ))))", " '---'  ((((          .=,",
				"     )   )))___.-''-./=;\\\\\\", "    /    (((         \\  ))))", "   ;                  | |//",
				"   /\\          |      | ((", "  (  \\    /__.-'\\    /   )", " / /` |  /    \\  \\  |",
				"/ /   \\ ;      \\ (\\ (", "\\\\_    ||       || ||", " \\_]   ||       || ||",
				"      /_<      /_</_< " };

		double ratio = ((double) guessedSoFar / (double) allowedGuesses);
		int linesToDraw = (int) Math.floor(ratio * 13);
		linesToDraw = linesToDraw <= 14 ? linesToDraw : 14;

		System.out.println();
		for (int i = 14 - linesToDraw; i < 14; i++) {

			System.out.printf("%s\n", horsey[i]);
		}
		System.out.println();

	}

	/**
	 * Reveals a correctly guessed letter from the user, while keeping the rest as
	 * blank underscores.
	 * 
	 * @param guess  The char value guessed by the user.
	 * @return <code>true</code> if a guessed letter was revealed, <code>false</code> otherwise.
	 */
	private boolean revealGuessedLetter(char guess) {

		boolean found = false;

		// TODO: Implement this method to alter the revealedLetters StringBuilder.
		// If guess is found to be in the secret word, display that char
		// at each point in revealedLetters by setting it to the appropriate
		// location(s)

		return found;

	}

	/**
	 * Checks if the user has correctly guessed the secret word.
	 * 
	 * @return <code>true</code> if the user has won the game, <code>false</code>
	 *         otherwise.
	 */
	private boolean checkGuess() {

		// TODO: Implement this method to check if the user has correctly guessed
		// all of the letters in the secret word. That is, you'll need to
		// compare revealedLetters to secretWord for equality.
		return false;

	}

}
