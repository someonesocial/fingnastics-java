import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomLevel extends Level {
    private ArrayList<Integer> letters = new ArrayList();
    private String message;
    private int[] myKeycodes = { 32, 44, 45, 46, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72,
            73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88 };

    public RandomLevel(int pAnzahl) {
        addLetters(pAnzahl);
        message = "Level n\nDrücken Sie die angebebenen Tasten!";
    }

    private void addLetters(int pAnzahl) {

        for (int i = 0; i < pAnzahl; i++) {
            int x;

            do {
                x = ThreadLocalRandom.current().nextInt(0, myKeycodes.length - 1); // zufalls Keycode erfinden
            } while (letters.contains(myKeycodes[x])); // schauen ob schon in liste weil taste zweimal drücken geht
                                                       // nicht ;)
            letters.add(myKeycodes[x]); // hinzufügen
        }

    }

    public ArrayList getLetters() {

        return letters;
    }

    public String getMessage() {
        return message;
    }
}

/*
 * Codes für Tasten
 * 32 -- Space
 * 44 -- Comma
 * 45 -- Minus
 * 46 -- Period
 * 48 -- 0
 * 49 -- 1
 * 50 -- 2
 * 51 -- 3
 * 52 -- 4
 * 53 -- 5
 * 54 -- 6
 * 55 -- 7
 * 56 -- 8
 * 57 -- 9
 * 65 -- A
 * 66 -- B
 * 67 -- C
 * 68 -- D
 * 69 -- E
 * 70 -- F
 * 71 -- G
 * 72 -- H
 * 73 -- I
 * 74 -- J
 * 75 -- K
 * 76 -- L
 * 77 -- M
 * 78 -- N
 * 79 -- O
 * 80 -- P
 * 81 -- Q
 * 82 -- R
 * 83 -- S
 * 84 -- T
 * 85 -- U
 * 86 -- V
 * 87 -- W
 * 88 -- X
 */