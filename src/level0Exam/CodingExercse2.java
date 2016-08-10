package level0Exam;

import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercse2 {

	public static void main(String[] args){
		String stringAge = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(stringAge);
		String hasHadBirthday = JOptionPane.showInputDialog("Have you had your birthday yet this year?");

		if(hasHadBirthday.equals("yes")){
			int year = 2016 - age;
			if(age > 30){
				JOptionPane.showMessageDialog(null,"You were born in "+year+". You're too old to play this game.");
			}else{
				JOptionPane.showMessageDialog(null, "You were born in "+year+".");
			}
		}else{
			int year = 2015 - age;
			if(age > 30){
				JOptionPane.showMessageDialog(null,"You were born in "+year+". You're too old to play this game.");
			}else{
				JOptionPane.showMessageDialog(null, "You were born in "+year+".");
			}
		}
		
		
		

	}
}



