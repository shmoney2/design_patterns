package state;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class State {
    protected VocabularyList vocabularyList;
    protected HashMap<String, String> words;
    private Random rand;

    public State(VocabularyList vocabularyList) {
        this.vocabularyList = vocabularyList;
        this.words = new HashMap<>();
        this.rand = new Random();
    }

    public String getNextDefinition() {
        if (words.isEmpty()) {
            return "No definitions available.";
        }

        ArrayList<String> definitions = new ArrayList<>(words.keySet());
        int index = rand.nextInt(definitions.size());

        return definitions.get(index);
    }

    public String getMatchingWord(String definition) {
        if (words.containsKey(definition)) {
            return words.get(definition);
        }

        return "No matching word found.";
    }

    public abstract void increaseGrade();

    public abstract void decreaseGrade();
}
