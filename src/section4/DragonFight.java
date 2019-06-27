package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		Random gen = new Random();
		int randomNumber = gen.nextInt(41);
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		JOptionPane.showMessageDialog(null, "To defeat the dragon is to gain \n riches beyond dreams! But be careful! To lose to the dragon is very easy, be \n brave and courages!");
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonhealth = 200;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttackDamagesword = 32;
		int playerattackDamagerifle = 55;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonAttackDamage = 40;
		// 6.  Delete the slashes at the beginning of the next line.  
		//while(playerHealth>0 && dragonhealth>0) {
		//}
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
	String attack = JOptionPane.showInputDialog("To kill the dragon you must choose a method of attack. \n Your choices are melee or rifle.");
		// 9. If they typed in "yell":
		if(answer.equals("melee")) {
		JOptionPane.showMessageDialog(null,"You manage to stab the dragon with your trusty blade and deal 32 damage. \n The Dragons health is now at 168" );
		}
		If (answer.equals("rifle")){
			
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}

