/**
 * @author Sahil
 * Word class
 */

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;
 /*
  * Default Constructor Class
  */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
 
    /**
     * Front of the card: just the word, sized to match the back, sidenote this was really irritating
     */
    public String getFlashCardFront() {
        String[][] rows = {
                { "Word: ", word.toUpperCase(), Colors.CYAN },
                { "", "", Colors.RESET },
                { "", "", Colors.RESET },
                { "", "", Colors.RESET }
        };
        return buildCard(rows);
    }
 
    /**
     * Back of the card: word, part of speech, definition, and example
     */
    public String getFlashCardBack() {
        String[][] rows = {
                { "Word: ", word.toUpperCase(), Colors.CYAN },
                { "Part of Speech: ", type, Colors.CYAN },
                { "Definition: ", definition, Colors.MAGENTA },
                { "Example: ", sentence, Colors.MAGENTA }
        };
        return buildCard(rows);
    }
 
    /**
     * Width is based on the back of the card 
     */
    private int getWidth() {
        String[] lines = {
                "Word: " + word,
                "Part of Speech: " + type,
                "Definition: " + definition,
                "Example: " + sentence
        };
        int max = 0;
        for (String line : lines) {
            max = Math.max(max, line.length());
        }
        return max + 2; // this was a guess based on your output, but can be wrong
    }
 
    private String buildCard(String[][] rows) {
        int width = getWidth();
        String border = Colors.CYAN + "+" + "-".repeat(width) + "+" + Colors.RESET + "\n";
 
        StringBuilder card = new StringBuilder(border);
        for (String[] row : rows) {
            String label = row[0];
            String value = row[1];
            String color = row[2];
            int padding = width - 1 - label.length() - value.length();
 
            card.append(Colors.CYAN).append("|").append(Colors.RESET)
                    .append(" ").append(label)
                    .append(color).append(value).append(Colors.RESET)
                    .append(" ".repeat(padding))
                    .append(Colors.CYAN).append("|").append(Colors.RESET)
                    .append("\n");
        }
        card.append(border);
        return card.toString();
    }
 
    @Override
    public String toString() {
        return word + " (" + type + "): " + definition;
    }
}
