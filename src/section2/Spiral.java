package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot robo = new Robot();
		robo.changeRobot("https://i.pinimg.com/originals/5b/b4/8b/5bb48b07fa6e3840bb3afa2bc821b882.jpg");
		robo.penDown();
		robo.setSpeed(100);
		for(int i = 0; i < 75; i++) {
			robo.setRandomPenColor();
			robo.move(5*i);
			robo.turn(360/7);
			robo.setPenWidth(i);
			
		}
		
		// 3. Set the robot to go at max speed (100)
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
			
	}
}
