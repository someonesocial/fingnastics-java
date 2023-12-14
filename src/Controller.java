import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.awt.event.KeyEvent;

public class Controller {
	private Fingnastics dasFingnastics;  //Objekt Fingnastics  
	private Level dasLevel[];
	private int currentLevel = 0;

	public Controller(Fingnastics pFingnastics) {
		this.dasFingnastics = pFingnastics;
		dasLevel = new Level[5];
		this.dasLevel[0] = new Level1();
		this.dasLevel[1] = new Level2();
		this.dasLevel[2] = new Level3();
		this.dasLevel[3] = new RandomLevel(4);
		this.dasLevel[4] = new RandomLevel(5);
		nextLevel();
	}

	public void nextLevel() {
		if (currentLevel >= 4) {
			dasFingnastics.display("\nGratulation, sie haben alle Level geschaft!");
		} else {
			dasFingnastics.display(dasLevel[currentLevel].getMessage() + "\n");
			dasLevel[currentLevel].getLetters()
					.forEach((n) -> dasFingnastics.display(java.awt.event.KeyEvent.getKeyText((int) n)));

		}
	}

	public void test() {
		// System.out.println(dasFingnastics.getKeys());
		// System.out.println(dasModel.getDemanded());
		if (dasFingnastics.getKeys().equals(dasLevel[currentLevel].getLetters())/*
																				 * listEqualsIgnoreOrder(dasFingnastics.
																				 * getKeys(
																				 * ), dasModel.getLevel1())
																				 */) {

			dasFingnastics.display("\n" + "richtig");
			currentLevel++;
			nextLevel();

		} else
			dasFingnastics.display("\n" + "falsch");

	}
	/*
	 * public static <T> boolean listEqualsIgnoreOrder(List<T> list1, List<T> list2)
	 * { //Adaptiert als Set damit reihenfolge egal
	 * return new HashSet<>(list1).equals(new HashSet<>(list2));
	 * }
	 */
}
