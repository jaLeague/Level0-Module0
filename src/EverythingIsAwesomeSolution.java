import javax.swing.JOptionPane;

// This recipe tells the user that what they like is awesome
//
// 1. Create a class called EverythingIsAwesome

public class EverythingIsAwesomeSolution {

	// 2. Add a main method
	public static void main(String[] args) {

		// 3. Use JOptionPane.showInputDialog to ask them what they like, e.g.
		// What do you like?
		// HINT: Use a variable to store their answer, e.g. space
		String whatILike = JOptionPane.showInputDialog("What do you like?");

		// 4. Use JOptionPane.showMessageDialog to tell them it is awesome, e.g.
		// space is awesome
		JOptionPane.showMessageDialog(null, whatILike + " is awesome!");
	}
}
