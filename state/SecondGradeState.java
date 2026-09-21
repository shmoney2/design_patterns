package state;
 /**
  * Represents the second grade state in the vocabulary list.
  * @author Sahil
  */
public class SecondGradeState extends State {
 //exact same implementation of the firstgrade status with the only difference being that it runs the second txt file to get the words for the second grade state.
    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("state/txt/second.txt");
    }
 
    public void increaseGrade() {
        System.out.println("Moving up to third grade...");
        vocabularyList.setState(vocabularyList.getThirdGradeState());
    }
 
    public void decreaseGrade() {
        System.out.println("Moving back to first grade...");
        vocabularyList.setState(vocabularyList.getFirstGradeState());
    }
}
