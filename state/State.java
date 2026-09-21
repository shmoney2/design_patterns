package state;
/**
 * Represents a state in the vocabulary list.
 * @author Sahil
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
/**
 * This is an abstract class that represents a state in the vocabulary list.
 * It provides methods to get the next definition: matching word for a definition,
 * and increase or decrease the grade level.
 */
public abstract class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    public State(VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.words = new HashMap<>();
        this.rand = new Random();
    }
//method to get the next def from list
/**
     * Returns the next definition from the vocabulary list.
     * @return the next definition
     */
    public String getNextDefinition() {
        if (words.isEmpty()) {
            return "No definitions available.";
        }

        ArrayList<String> definitions = new ArrayList<>(words.keySet());
        int index = rand.nextInt(definitions.size());
        /**
         * Returns the next definition from the vocabulary list.
         * @return the next definition
         */
        return definitions.get(index);
    }
/*
     * Returns the word that matches the given definition.
     * @param definition the definition for which to find a matching word
     * @return the matching word or a default message if not found
     */
    public String getMatchingWord(String definition) {
        if (words.containsKey(definition)) {
            return words.get(definition);
        }

        return "No matching word found.";
    }

    public abstract void increaseGrade();

    public abstract void decreaseGrade();
}
