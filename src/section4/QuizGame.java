package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		int score = 0;
		// 1.  Create a variable to hold the user's score 
		JOptionPane.showMessageDialog(null, "answer these questions using yes or no- no capitals");
		String answer1 = JOptionPane.showInputDialog(null, "are dogs edible?");
		// 2.  Ask the user a question 
		if(answer1.equals("yes")) {
			score = score+1;
		}
		String answer2 = JOptionPane.showInputDialog(null, "are you vegan?");
				
		// 3.  Use an if statement to check if their answer is correct
		if(answer2.equals("no")) {
			score = score + 1;
		}
		// 4.  if the user's answer is correct
		String answer3 = JOptionPane.showInputDialog("Was vodka invented in America?");
		if(answer3.equals("no")) {
			score = score + 1;
		}
		
		JOptionPane.showMessageDialog(null, "your score is "+ score +"/3");
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
