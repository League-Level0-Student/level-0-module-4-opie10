package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import java.applet.AudioClip;
import java.awt.JobAttributes;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FruitQuiz extends KeyAdapter{

	void makeQuestions() {
	question1 = new JLabel("<html>Which is not a real fruit? <br> A: Dragon Fruit <br> B: Durian <br> C: Crazyberry</html>");
		// 11. Make another question called "question2".  Use question1 above as a guide.
	question2 = new JLabel("<html>Which is not a real swimming stroke? <br> A: Backstroke <br> B: Brestroke  <br> C: Sidestroke</html>");
	question3 = new JLabel("<html>Which is not a real type of dog? <br> A: Catahoula <br> B: Chihuaahau  <br> C: Great dane</html>");
	question4 = new JLabel("<html>Which is not a real place? <br> A: Westbouough  <br> B: Taumatawhakatangi <br> C: Aceville</html>");
	question5 = new JLabel("<html> If you choose an answer to this question at random, what is the chance you will be correct?<br> A: 25% <br> B:  50%  <br> C:0%<br> D: 25% <br> E: None are right <br>F:All are right </html>");
	question6 = new JLabel("<html> Which book is this the opening line of?'It was a bright cold day in april and the clocks were striking thirteen'<br> A:The Catcher in the Rye, by J.D. Salinger <br> B:1984, by George Orwell <br> C:Catch 22, by Joseph Heller</html>");
	question7= new JLabel("<html>Which  answer is correct? <br> A:All of the Below   <br> B:  None of the Below  <br> C:All of the above <br> D: One Of the above  <br> E: None of the above <br> F: None of the above  </html>");
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
System.out.println(keyCode);
		// 2. Make 3 int variables that hold the key codes for A, b, and C
		int A =  65;
		int B = 66;
		int C = 67;
		// 14. Repeat steps 11, 12, and 13 for question3 and question4 - IMPORTANT: The questions must be in reverse order from top to bottom to work properly
		if (question7.isShowing()) {
			if(keyCode == 69) {
				correct();
				JOptionPane.showMessageDialog(null, "You got to question 7, you win!! You are also the smartest person ever ");
			}
				else {
				incorrect();	
				JOptionPane.showMessageDialog(null, "You got to question 7");
				System.exit(0);
				}
			}
		if (question6.isShowing()) {
			if(keyCode == 66) {
				correct();
				nextQuestion(question7);
			}
				else {
				incorrect();	
				JOptionPane.showMessageDialog(null, "You got to question 6 ");
				System.exit(0);
				}
			}
		if (question5.isShowing()) {
			if(keyCode == 69) {
				correct();
				nextQuestion(question6) ;	
			}
				else {
				incorrect();	
				JOptionPane.showMessageDialog(null, "You got to question 5");
				System.exit(0);
				
				}
			}
		if (question4.isShowing()) {
			if(keyCode == 65) {
				correct();
				nextQuestion(question5) ;
			}
				else {
				incorrect();	
				JOptionPane.showMessageDialog(null, "You got to question 4");
				System.exit(0);}
			}
		else if (question3.isShowing()) {
			if(keyCode == 66) {
				correct();
				nextQuestion(question4) ;
			}
				else  {
				incorrect();	
				JOptionPane.showMessageDialog(null, "You got to question 3");
				System.exit(0);}
			}
		// 12. If question2 is showing,
		else if (question2.isShowing()) {
			if(keyCode == 66) {
				correct();
				nextQuestion(question3);
			}	// 13. check if it is right or wrong like you did for question1
		else {
			incorrect();
			JOptionPane.showMessageDialog(null, "You got to question 2");
			System.exit(0);}
		}	
		else if (question1.isShowing()) {
			// 3. If they selected the right fruit, do steps 4 and 7
			if(keyCode == 67) {
				correct();
				nextQuestion(question2);
			}
			
			
				// 4. Call the correct() method
				
				// 7. Use the nextQuestion() method to go to question2
			
			
			// 8. else (if they touched something else)
			else {
				incorrect();
				JOptionPane.showMessageDialog(null, "You got to question 1");
				System.exit(0);
				// 9. Call the incorrect() method
			}
		}

	}

	private void correct() {
		// 5. Find a sound for when they get a question right, and drag it into
		// the 'extra' package. It must be a .wav file. 
		// There are lots on freesound.org
		// 6. Use the playSound method to play your sound

playSound("correct.wav");
	}

	private void incorrect() {
		// 10. Find a sound for wrong answers and put it in the default package. Use the playSound method to play it.
playSound("wrong.wav");
	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.remove(question5);
		frame.remove(question6);
		frame.remove(question7);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5= new JLabel(),question6= new JLabel(),question7;
}

