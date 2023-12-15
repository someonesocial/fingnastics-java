
import java.util.ArrayList;

public class Level1 extends Level { // Level1 erbt hier alle Methoden und Eigenschaften von der Klasse Level
    private ArrayList<Integer> letters = new ArrayList(); // letters ist eine ArrayList die Integer-Werte speichert
    private String message = "Level 1\nWillkommen bei Fingnastics,\ndrücken Sie die angebebene Taste!"; //message ist eine Zeichenkette (String) die eine Nachricht enthält.

    public Level1() {
        addLetters();
    }

    private void addLetters() {  //zu Arraylist werden letters hinzugefügt.

        letters.add(70); // f

    }
         // diese Methode fügt der ArrayList 'letters' den Wert 70 hinzu, der in diesem Fall dem Buchstaben F entspricht.
    public ArrayList getLetters() {

        return letters;
    }
        //getLetters() gibt die ArrayList 'letters' zurück.
    public String getMessage() {
        return message;
    }
        //getMessage() gibt die Nachricht 'message' zurück.
}
