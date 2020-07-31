package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String answer = JOptionPane.showInputDialog(null, "Can you write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (answer.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world. Script complete.");
			// 3. Otherwise, wish them good luck washing dishes.
		} else {
			JOptionPane.showMessageDialog(null, "Good Luck washing dishes. Script complete.");
		}
	}
}
