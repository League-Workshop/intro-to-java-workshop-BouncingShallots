package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot jeff = new Robot();
		jeff.hide();
		jeff.moveTo(250, 400);
		jeff.setPenColor(Color.black);
		jeff.penDown();

		for (int i = 0; i < 360; i = i + 1) {
			jeff.setSpeed(500);
			jeff.move(2);
			jeff.turn(1);
		}
		jeff.moveTo(300, 240);
		for (int i = 0; i < 360; i = i++) {
			jeff.setSpeed(500);
			jeff.move(2);
			jeff.turn(1);
		}
	}
}
