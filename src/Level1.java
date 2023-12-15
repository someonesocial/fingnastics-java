
import java.util.ArrayList;

//Klasse "Level1" erbt von der Elternklasse "Level"
public class Level1 extends Level { // Level1 erbt hier alle Methoden und Eigenschaften von der Klasse Level
    //Initialisierung der notwendigen Variablen
    private ArrayList<Integer> letters = new ArrayList(); // letters ist eine ArrayList die Integer-Werte speichert
    private String message = "Level 1\nWillkommen bei Fingnastics,\ndrücken Sie die angebebene Taste!"; //message ist eine Zeichenkette (String) die eine Nachricht enthält.

    public Level1() {
        addLetters();
    }

    //Funktion ohne Rückgabewert, die der ArrayList: "letters" den Zahlenwert: 70 hinzufügt, dieser stellt ein "F" dar.
    private void addLetters() {  
        letters.add(70); // diese Methode fügt der ArrayList 'letters' den Wert 70 hinzu, der in diesem Fall dem Buchstaben F entspricht.
    }

    public ArrayList getLetters() { //Getter welches die ArrayListe "letters" zurückgibt
        return letters;
    }

    public String getMessage() {//Getter welche die "message" zurückgibt
        return message;
    }
        //getMessage() gibt die Nachricht 'message' zurück.
}
