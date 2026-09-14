package state;
 
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