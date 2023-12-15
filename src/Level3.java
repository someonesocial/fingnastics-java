
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

////Klasse "Level3" erbt von der Elternklasse "Level"
public class Level3 extends Level {
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "Level 3\nDrücken Sie die angebebene Tasten gleichzeitig in der richtigen Reihenfolge!";

    //Konsturktor der Klasse -> ruft initial die addLeters()-Methode auf, welche die Buchstaben der ArrayList: "letters" hinzufügt
    public Level3() {
        addLetters();
    }

    //Funktion welche die Buchstaben "F", sowie "J" und "A" als Integerwerte in die ArrayList: "letters" hinzufügt
    private void addLetters() {
        letters.add(70); // f
        letters.add(74); // j
        letters.add(65); // a
    }

    //Getter der die ArrayList "letters" zurückgibt
    public ArrayList getLetters() {
        return letters;
    }

    //Getter welche die "message" zurückgibt 
    public String getMessage() {
        return message;
    }

}
