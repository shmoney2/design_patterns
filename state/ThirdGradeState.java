package state;
 /**
  * Represents the third grade state in the vocabulary list.
  * @author Sahil
  */
 //exact same implementation of the firstgrade status with the only difference being that it runs the third txt file to get the words for the third grade state.
public class ThirdGradeState extends State {
 
    public ThirdGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("state/txt/third.txt");
    }
 
    public void increaseGrade() {
        System.out.println("You are already in third grade.");
    }
 
    public void decreaseGrade() {
        System.out.println("Moving back to second grade.");
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
}