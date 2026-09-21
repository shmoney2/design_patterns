package state;
 /**
  * Represents the first grade state in the vocabulary list.
  * @author Sahil
  */
public class FirstGradeState extends State {
 //Creates the 2 functions of increase grade and decrease grade, and thenruns the first txt file to get the words for the first grade state.
    public FirstGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("state/txt/first.txt");
    }
 
    public void increaseGrade() {
        System.out.println("Moving up to second grade...");
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
 
    public void decreaseGrade() {
        System.out.println("You are already in first grade...");
    }
}
