
import java.util.ArrayList;

//Klasse "Level2" erbt von der Elternklasse "Level"
public class Level2 extends Level {

    //Initialisierung der Variablen aus der Elternklasse
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "Level 2\nDrücken Sie jetzt beide angebebene Tasten gleichzeitig!";

    //Konsturktor der Klasse -> ruft initial die addLeters()-Methode auf, welche die Buchstaben der ArrayList: "letters" hinzufügt
    public Level2() {
        addLetters();
    }

    //Funktion welche die Buchstaben "F", sowie "J" als Integerwerte in die ArrayList: "letters" hinzufügt
    private void addLetters() {
        letters.add(70); // f
        letters.add(74); // j
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
