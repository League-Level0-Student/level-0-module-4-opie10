package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. 
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nick = JOptionPane.showInputDialog("How many Nickels do you have? ");
		// Convert their answer to an int using Integer.parseInt()
		double els = Integer.parseInt(nick);
		// Ask the user how many dimes they have, and convert their answer
		String di = JOptionPane.showInputDialog("How many dimes do you have? ");
		double me = Integer.parseInt(di);
		// Ask the user how many quarters they have, and convert their answer
		String quar = JOptionPane.showInputDialog("How many Quarters do you have? ");
		double ters = Integer.parseInt(quar);
		// Calculate how much money the user has and save it in a double variable
		double all = ((els * 5) + (me * 10) + (ters * 25)) / 100;
		// Tell the user how much money they have
		if (all > 400.00) {
			JOptionPane.showMessageDialog(null, "You have $" + all + " , you are a billionaire and need to give some of your money to a deserving charity.");
		}if (all > 4.00&&all <400.00) {
			JOptionPane.showMessageDialog(null, "You have $" + all + " , you are RICH!!!!!!");
		} if (all<4.00) {
			JOptionPane.showMessageDialog(null, "You have $" + all + " , you have spent all your fourtune");
		}
		
		}
	}

