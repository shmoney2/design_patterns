package decorator;
//This class is the Warrior class that extends Player class
public class Warrior extends Player{
    public Warrior(String name) {
        super(FileReader.getLines(Gear.PATH + "warrior.txt"), name);
    }
}