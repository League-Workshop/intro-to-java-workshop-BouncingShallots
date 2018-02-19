package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("do you know how to code?");
		
	
		if(answer.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you will rule the world");	
		
		}
		else {
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
		
		
	}
	
	
}