package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-\n infested river, here's how to do it...");
		// Get the user to enter an adjective
String name = JOptionPane.showInputDialog("Enter adjective");
		// Get the user to enter a type of liquid
String eman = JOptionPane.showInputDialog("Enter Liquid");
		// Get the user to enter a body part
String mane = JOptionPane.showInputDialog("Enter bodypart");
		// Get the user to enter a verb
String enam = JOptionPane.showInputDialog("Enter verb");
		// Get the user to enter a place
String amen = JOptionPane.showInputDialog("Enter place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String story = "Pirhanas are more" +adjective+ ",do cross the river at night. Pirhanas are \n to fresh" +liquid+ "and will most likely take a bite out of your" +bodypart+ "if \n you" +verb+ ". Whatever you do be safe and try to reach" +place+ ";
		// Make a pop-up for the final story. You can use \n to go to the next line
		
				
	}
}

