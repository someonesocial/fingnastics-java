
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Level3 extends Level {
    private ArrayList<Integer> letters = new ArrayList();
    private String message = "\nLevel 1\nDrücken Sie die angebebene Tasten gleichzeitig in der richtigen Reihenfolge!";

    public Level3() {
        addLetters();
    }

    private void addLetters() {

        letters.add(70); // f
        letters.add(74); // j
        letters.add(65); // a

    }

    public ArrayList getLetters() {

        return letters;
    }

    public String getMessage() {
        return message;
    }

}
