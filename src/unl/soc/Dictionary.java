package unl.soc;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * A dictionary class that maintains a collection of words.
 *
 */
public class Dictionary {

	private static final Random R = new Random();

	private static final String FILE_NAME = "data/dictionary.txt";

	private static final ArrayList<String> WORDS = new ArrayList<String>();

	static {
		// we load words from the dictionary statically when this class
		// gets loaded
		try(Scanner input = new Scanner(new File(FILE_NAME))){

			String word;
			while (input.hasNext()) {
				word = input.next();
				WORDS.add(word);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Retrieves a random word from the dictionary.
	 * 
	 * @return
	 */
	public static String getRandomWord() {

		int randomIndex = R.nextInt(WORDS.size());

		return WORDS.get(randomIndex);
	}

}
