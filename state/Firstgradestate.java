package state;
 
public class FirstGradeState extends State {
 
    public FirstGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("state/txt/first.txt");
    }
 
    public void increaseGrade() {
        System.out.println("Moving up to second grade.");
        vocabularyList.setState(vocabularyList.getSecondGradeState());
    }
 
    public void decreaseGrade() {
        System.out.println("You are already in first grade.");
    }
}
