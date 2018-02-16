package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot jeff = new Robot ();
		jeff.hide();
		jeff.penDown();
		// 5. Set your robot's pen down 
		
		jeff.setSpeed(10);
		
		for(int i = 0; i <75; i ++) {
			jeff.setRandomPenColor();
			jeff.setPenWidth(i);
		
		
			// 7. Change the pen color to random
		
			jeff.move(5*i);
			
			jeff.turn(360/7);
		
			// 8. Set the pen width to i
		}	
	}
}
