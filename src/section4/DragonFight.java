package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int playerHealth = 100;
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int dragonHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int playerdmg = 10;
		// 4. Create a variable to hold the damage the player's attack does each round
		int dragondmg = 15;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		String attack = JOptionPane.showInputDialog("do you want to attack the dragon with a yell or a kick?");
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		if(attack.equals("yell")) {
			playerdmg = new Random().nextInt(11);
			dragonHealth = dragonHealth - playerdmg-10;
		}
			if(attack.equals("kick")) {
				playerdmg = new Random().nextInt(31);
				dragonHealth = dragonHealth-playerdmg;
			}
		dragondmg = new Random().nextInt(36);
		playerHealth = playerHealth - dragondmg;
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		if(playerHealth <= 0) {
			JOptionPane.showMessageDialog(null, "you  lost- the dragon still had "+dragonHealth+" hitpoint(s)");
		}
		else if(dragonHealth<= 0) {
			JOptionPane.showMessageDialog(null, "you killed the dragon and took a ton of gold!!!! You still had "+playerHealth+ " hitpoint(s)!");
		}
		// 13. If the user's health is less than or equal to 0
		else {
			JOptionPane.showMessageDialog(null, "Your current health is "+playerHealth+" and the dragon's health is "+dragonHealth + ". You have lost "+dragondmg+" hitpoint(s), and the dragon has lost "+playerdmg+" hitpoint(s)");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}

