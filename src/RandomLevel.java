import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomLevel extends Level {
    private ArrayList<Integer> letters = new ArrayList();
    private String message;

    public RandomLevel(int pAnzahl) {
        addLetters(pAnzahl);
        message = "\nLevel n\nDrücken Sie die angebebenen Tasten!";
    }

    private void addLetters(int pAnzahl) {

        for (int i = 0; i < pAnzahl; i++) {
            int x;

            do {
                x = ThreadLocalRandom.current().nextInt(65, 90 + 1);
            } while (letters.contains(x));
            letters.add(x);
        }

    }

    public ArrayList getLetters() {

        return letters;
    }

    public String getMessage() {
        return message;
    }
}
