
import java.util.ArrayList;

//Klasse "Level1" erbt von der Elternklasse "Level"
public class Level1 extends Level {
    
    //Initialisierung der notwendigen Variablen
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "Level 1\nWillkommen bei Fingnastics,\ndrücken Sie die angebebene Taste!";

    public Level1() {
        addLetters();
    }
    //Funktion ohne Rückgabewert, die der ArrayList: "letters" den Zahlenwert: 70 hinzufügt, dieser stellt ein "F" dar.
    private void addLetters() {  
        letters.add(70); // f
    }

    //Getter welches die ArrayListe "letters" zurückgibt
    public ArrayList getLetters() {
        return letters;
    }
    //Getter welche die "message" zurückgibt 
    public String getMessage() {
        return message;
    }

}
