
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Fingnastics extends JFrame implements KeyListener, ActionListener {
	JTextArea displayArea;

	static final String newline = System.getProperty("line.separator");
	private ArrayList keys = new ArrayList(); // This ArrayList will hold all the key codes of currently pressed keys.
	private Character lastKey = null;
	private Controller derController;

	public static void main(String[] args) {
		////////////////////////////////////////////////// Anfang Swing
		////////////////////////////////////////////////// (GUI)//////////////////////////////////////////////////
		/* Use an appropriate Look and Feel */
		try {
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			// UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		// Schedule a job for event dispatch thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

	//Erzeugt die GUI und zeigt diese an. 
	private static void createAndShowGUI() {
		// Create and set up the window.
		Fingnastics frame = new Fingnastics("Fingnastics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set up the content pane.
		frame.addComponentsToPane();

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	private void addComponentsToPane() {

		JButton button = new JButton("Clear");
		button.addActionListener(this);

		displayArea = new JTextArea();
		displayArea.setEditable(false);
		displayArea.setLineWrap(true);
		displayArea.addKeyListener(this);
		displayArea.setFocusTraversalKeysEnabled(false);
		JScrollPane scrollPane = new JScrollPane(displayArea);
		scrollPane.setPreferredSize(new Dimension(375, 125));

		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(button, BorderLayout.PAGE_END);
		///////////////////////////////////////////////// Ende
		///////////////////////////////////////////////// Swing////////////////////////////////////////
		derController = new Controller(this); // Am ende der Initalisierung der grafik elemente wird das Controller
												// objekt erstellt

	}

	public Fingnastics(String name) {

		super(name);

	}

	@Override
	public void keyPressed(KeyEvent k) { // Wen taste gedrückt

		if (lastKey == null || lastKey != k.getKeyChar()) {
			lastKey = k.getKeyChar();
			if (!keys.contains(k.getKeyCode())) { // schauen ob taste schon in Arraylist keys, wenn nicht hinzufügen
				keys.add(k.getKeyCode());
			}
			derController.test(); // auruf der Test Funktin im Controller
		}
	}

	@Override
	public void keyReleased(KeyEvent k) { // Wen taste losgelassen
		lastKey = null;

		if (keys.contains(k.getKeyCode())) { // schauen ob taste schon in Arraylist keys, wenn ja entfernen
			keys.remove(keys.indexOf(k.getKeyCode()));
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

		// brauchen wir nicht ist aber abstrakt muss also implementiert werden
	}

	/** Handle the button click. */
	public void actionPerformed(ActionEvent e) {
		// Clear the text components.
		displayArea.setText("");

		// Return the focus to the display area.
		displayArea.requestFocusInWindow();
	}

	///////////////////////////////////////////////////////////////////////////////////
	public ArrayList getKeys() { // getter für arraylist keys
		return keys;
	}

	public void display(String pDisplay) { // Display funktion (erstatz für system.out.println)
		displayArea.append(pDisplay);

	}
}
