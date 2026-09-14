package state;
 
public class SecondGradeState extends State {
 
    public SecondGradeState(VocabularyList vocabularyList) {
        super(vocabularyList);
        this.words = FileReader.getWords("state/txt/second.txt");
    }
 
    public void increaseGrade() {
        System.out.println("Moving up to third grade.");
        vocabularyList.setState(vocabularyList.getThirdGradeState());
    }
 
    public void decreaseGrade() {
        System.out.println("Moving back to first grade.");
        vocabularyList.setState(vocabularyList.getFirstGradeState());
    }
}
