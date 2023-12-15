
import java.util.ArrayList;

public class Level2 extends Level {
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "Level 2\nDrücken Sie jetzt beide angebebene Tasten gleichzeitig!";

    public Level2() {
        addLetters();
    }

    private void addLetters() {

        letters.add(70); // f
        letters.add(74); // j

    }

    public ArrayList getLetters() {

        return letters;
    }

    public String getMessage() {
        return message;
    }

}
