
import java.util.ArrayList;

public class Level1 extends Level { // erbt von klasse Level
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "\nLevel 1\nWillkommen bei Fingnastics,\ndrücken Sie die angebebene Taste!";

    public Level1() {
        addLetters();
    }

    private void addLetters() {  //zu arraylist letters hinzufügen

        letters.add(70); // f

    }

    public ArrayList getLetters() {

        return letters;
    }

    public String getMessage() {
        return message;
    }

}
