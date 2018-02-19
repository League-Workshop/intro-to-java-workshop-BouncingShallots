package section4;

import javax.swing.JOptionPane;

public class Game {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("hello what is your name?");
		String age = JOptionPane.showInputDialog("how old are you?");
		String location = JOptionPane.showInputDialog("Where do you live?");
		String job = JOptionPane.showInputDialog("what is your job?");
		int x = Integer.parseInt(age);
		if(x<= 16) {
			JOptionPane.showMessageDialog(null, "you are unemployed!");
		}
			
		
			
	}

}
