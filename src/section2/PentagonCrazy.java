package section2;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot jeff = new Robot ();
         jeff.hide();
		jeff.penDown();
		jeff.setSpeed(100);

		jeff.setPenColor(Color.BLUE);
		
		int i = 100;

		int s = 72;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you should see a pentagon
            for(int n = 0; n < 200; n++) {
			jeff.move(n);
			jeff.turn(72);
			jeff.turn(1);
	
            }
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}