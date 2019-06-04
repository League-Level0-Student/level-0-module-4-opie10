package charAt_scanners_optionDialogs;

import java.util.Random;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog("What type of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0; i < 11; i++) {
	

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What do you want to do with your " + pet + "?", "Pet activities",
				0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Cuddle", "Feed", "Pet", "Walk", "Clean house and poop", "Drown","Quit Game" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
System.out.println(task);
		if (task == 0) {
		cuddle (pet) ;
		}
		if (task == 1) {
			Feed (pet) ;
			}
		if (task == 2) {
			Pet (pet) ;
			}
		if (task == 3) {
			Walk(pet) ;
			}
		if (task == 4) {
			clean (pet) ;
			}
		if (task == 5) {
			Drown (pet) ;
			}
		if (task == 6) {
			System.exit(0);
			}
		// 6. If you determine the happiness level is large enough, tell the
		// user that he loves his pet and use break; to exit for loop.
if (happinessLevel >=100) {
	
JOptionPane.showMessageDialog(null, "Your "+ pet + " loves you and will stay with you for the rest of it's life.");
break;
}
JOptionPane.showMessageDialog(null, "Your "+ pet +"'s happiness level is "+happinessLevel);
}
}

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	static Random happy = new Random();

	private static void cuddle(String pet) {

		int Hapy = happy.nextInt(21);
		JOptionPane.showMessageDialog(null,
				"Your " + pet + " liked cuddling and you increased their happiness level by " + Hapy);
happinessLevel += Hapy ;
	}

	private static  void Feed(String pet) {

		int Hapy = 	happy.nextInt(21);
		JOptionPane.showMessageDialog(null,
				"Your " + pet + " liked their food and you increased their happiness level by " + Hapy);
		happinessLevel += Hapy ;
	}

	private static void Pet(String pet) {

		int Hapy = happy.nextInt(21);
		JOptionPane.showMessageDialog(null,
				"Your " + pet + " liked being petted and you increased their happiness level by " + Hapy);
		happinessLevel += Hapy ;
	}

	private static void Walk(String pet) {

		int Hapy = happy.nextInt(31);
		JOptionPane.showMessageDialog(null,
				"Your " + pet + " loved walking and you increased their happiness level by " + Hapy);
		happinessLevel += Hapy ;
	}

	private static void clean(String pet) {

		int Hapy = happy.nextInt(21);
		JOptionPane.showMessageDialog(null,
				"Your " + pet + " liked you cleaning their stuff and you increased their happiness level by " + Hapy);
		happinessLevel += Hapy ;
	}

	private static void Drown(String pet) {

		happy.nextInt(21);
		JOptionPane.showMessageDialog(null, "Your " + pet + " HATED drowning and you are the worst pet owner ever. Your "
				+ pet + "'s happiness level is 0");
System.exit(0);	}

}