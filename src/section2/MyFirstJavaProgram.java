package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot rob = new Robot();
		rob.setSpeed(250);
		rob.penDown();
		while(true) {
		rob.move(200);
		rob.turn(95);
		rob.setRandomPenColor();
	
		
		}
	}
}
