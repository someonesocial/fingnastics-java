public class Controller {

	// globale Variablen
	private Fingnastics dasFingnastics; // Objekt Fingnastics
	private Level dasLevel[];
	private int currentLevel = 0;

	public Controller(Fingnastics pFingnastics) { // constructor für Klasse Controller
		dasFingnastics = pFingnastics; // Objekt referenz von Fingnastics Objekt
		dasLevel = new Level[5]; // Level-Objekt array

		//Instanzierung von Objekte
		dasLevel[0] = new Level1();
		dasLevel[1] = new Level2();
		dasLevel[2] = new Level3();
		dasLevel[3] = new RandomLevel(4);
		dasLevel[4] = new RandomLevel(5);
		nextLevel();
	}
// Hier wurde bissl was angepasst
	public void nextLevel() { // display für das nächste level auf
		if (currentLevel >= 5) {
			dasFingnastics.actionPerformed(null);
			dasFingnastics.display("\nGratulation, sie haben alle Level geschaft!");

		} else {
			dasFingnastics.display(dasLevel[currentLevel].getMessage() + "\n");
			dasLevel[currentLevel].getLetters() // get arraylist von level objekt
					.forEach((n) -> dasFingnastics.display(java.awt.event.KeyEvent.getKeyText((int) n) + " ")); // display
																												// alle
																												// Buchstaben
																												// dazu
																												// umwandlung
																												// von
																												// keycodes
																												// in
																												// text

		}
	}

	public void test() { // checken ob die alle tasten gedrückt sind

		if (dasFingnastics.getKeys().equals(dasLevel[currentLevel].getLetters())/*
																				 * listEqualsIgnoreOrder(dasFingnastics.
																				 * getKeys(
																				 * ), dasModel.getLevel1())
																				 */) { // Sind die beiden Listen gleich?

			dasFingnastics.display("\n" + "richtig" + "\n");
			currentLevel++;
			nextLevel();

		} else
			dasFingnastics.display("\n" + "falsch" + "\n");

	}
}
