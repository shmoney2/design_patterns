import java.util.ArrayList;
import java.util.Random;
/**
 * @author Sahil
 * This is the totality of Flash cards, it is a singleton class that will be used to get the words from the txt file and then return them to the UI class.
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;

    /**
     * Private constructor so only getInstance() can create the object
     */
    private FlashCards() {
        rand = new Random();
        words = FileReader.getWords();
    }

    /**
     * Returns Flashcards Instance
     * 
     * @return the FlashCards instance
     */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    /**
     * Returns a random word from the list
     * 
     * @return a random Word if there is a word to retun, otherwise null
     */
    public Word getWord() {
        if (words.isEmpty()) {
            return null;
        }
        return words.get(rand.nextInt(words.size()));
    }
}
