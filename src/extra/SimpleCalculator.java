package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String number1 = JOptionPane.showInputDialog("Give me a number or else");
		String number2 = JOptionPane.showInputDialog("Give me another number or else"); // 2. Customize pop-up to
																						// support
																						// add/subtract/multiply/divide
																						// operations.
		int operation = JOptionPane.showOptionDialog(null,
				"What opereration do you want to do with " + number1 + " and " + number2 + "?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply ", "Divide" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
double one =Double.parseDouble(number1);
double two=Double.parseDouble(number2);
Add(one,two);
Subtract(one,two);
Multiply(one,two);
Divide(one,two);
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static double Add(double number1, double number2) {

		return number1 + number2;
	}static double Subtract(double number1, double number2) {

		return number1 - number2;
	}static double Divide(double number1, double number2) {

		return number1 / number2;
	}static double Multiply(double number1, double number2) {

		return number1 * number2;
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}