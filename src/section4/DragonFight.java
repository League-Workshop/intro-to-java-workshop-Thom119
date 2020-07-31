package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below)
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");

		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 1;
		// 4. Create a variable to hold the damage the player's attack does each round
		int attackDamage = 10;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 25;

		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
														// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick
			String choice = JOptionPane.showInputDialog("Pick: Fight Guard Magic");
			// 9. If they typed in "yell":
			if (choice.equals("Fight")) {
				attackDamage = new Random().nextInt(10);
				if (attackDamage == (10)) {
					dragonHealth = dragonHealth - 100;
					JOptionPane.showMessageDialog(null, "Critical Hit!");
				} else if (attackDamage < 9) {
					dragonHealth = dragonHealth - new Random().nextInt(50);
				} else if (attackDamage == (1)) {

				}
				// -- Find a random number between 0 and 10 and store it in dragonDamage

				// -- Subtract that number from the dragon's health variable

				// 10. If they typed in "kick":
				if (choice.equals("Magic")) {
					JOptionPane.showInputDialog("Pick: Sword of Heaven Circle of Regeneration Yeet");
					if (choice.equals("Sword of Heaven")) {
						attackDamage = new Random().nextInt(10);
						if (attackDamage == (10)) {
							dragonHealth = dragonHealth - 250;
						} else
							JOptionPane.showMessageDialog(null, "Missed");
						if (choice.equals("Circle of Regeneration")) {
							playerHealth = playerHealth + new Random().nextInt(30);
							if (choice.equals("Yeet")) {
								dragonHealth = dragonHealth - new Random().nextInt(250);
							}
						}
					}
					// -- Find a random number between 0 and 25 and store it in dragonDamage
					dragonDamage = new Random().nextInt(100);
					playerHealth = playerHealth - dragonDamage;
					// -- Subtract that number from the dragon's health variable

					// 11. Find a random number between 0 and 35 and store it in playerDamage

					// 12. Subtract this number from the player's health

					// 13. If the user's health is less than or equal to 0
					if (playerHealth == 0) {
						JOptionPane.showMessageDialog(null, "You Died.");
					} else if (playerHealth < 0) {
						JOptionPane.showMessageDialog(null, "You Died.");
					}

					// -- Tell the user that they lost

					// 14. Else if the dragon's health is less than or equal to 0
					else if (dragonHealth <= 0) {
						// -- Tell the user that the dragon is dead and they took a ton of gold!
						JOptionPane.showMessageDialog(null, "Dragon Down. You eagerly rush over to the chest.");
						if (playerHealth < 30) {
							JOptionPane.showMessageDialog(null,
									"Last Place with four eyes placed. You got 22 superior fragments.");
						} else if (playerHealth < 60 && playerHealth > 30) {
							JOptionPane.showMessageDialog(null,
									"Second place with 4 eyes. Not bad! You got an Aspect of the Dragons!");
						} else {
							JOptionPane.showMessageDialog(null,
									"First Place with 4 eyes! You open the chest to see...Frags? NOOOOOOOOOOOOOO!!! ");
						}

						// 15. Else

						// -- Pop up a message that tells the their current health and the dragon's
						// currently health (Bonus: Also display the amount of health that was lost for
						// each player this round)

					}
				}
			}
		}
	}
}
