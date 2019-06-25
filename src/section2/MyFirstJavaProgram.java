package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot rog = new Robot();
rog.penDown();
rog.setSpeed(1000);
for(int i = 0; i < 360; i++) {
		rog.turn(-90);
		rog.move(150);
		rog.turn(360/360);
		rog.sparkle();
	}
}}