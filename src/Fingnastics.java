
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Fingnastics extends JFrame implements KeyListener, ActionListener {
	JTextArea displayArea;
	JTextField typingArea;
	static final String newline = System.getProperty("line.separator");
	private ArrayList keys = new ArrayList(); // This ArrayList will hold all the key codes of currently pressed keys.
	private Controller derController;

	public static void main(String[] args) {

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

	/**
	 * Create the GUI and show it. For thread safety, this method should be invoked
	 * from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		Fingnastics frame = new Fingnastics("KeyEventDemo");
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

		typingArea = new JTextField(20);
		typingArea.addKeyListener(this);

		// Uncomment this if you wish to turn off focus
		// traversal. The focus subsystem consumes
		// focus traversal keys, such as Tab and Shift Tab.
		// If you uncomment the following line of code, this
		// disables focus traversal and the Tab events will
		// become available to the key event listener.
		typingArea.setFocusTraversalKeysEnabled(false);

		displayArea = new JTextArea();
		displayArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(displayArea);
		scrollPane.setPreferredSize(new Dimension(375, 125));

		getContentPane().add(typingArea, BorderLayout.PAGE_START);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(button, BorderLayout.PAGE_END);
		this.derController = new Controller(this);
	}

	public Fingnastics(String name) {

		super(name);

	}

	@Override
	public void keyPressed(KeyEvent k) {

		if (!keys.contains(k.getKeyCode())) {
			keys.add(k.getKeyCode());
		}
		this.derController.test();
	}

	@Override
	public void keyReleased(KeyEvent k) {
		if (keys.contains(k.getKeyCode())) {
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
		typingArea.setText("");

		// Return the focus to the typing area.
		typingArea.requestFocusInWindow();
	}

	///////////////////////////////////////////////////////////////////////////////////
	public ArrayList getKeys() {
		return keys;
	}

	public void display(String pDisplay) {
		displayArea.append(pDisplay + "\n");

	}
}
