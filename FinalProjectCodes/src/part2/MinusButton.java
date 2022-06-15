package part2;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MinusButton extends JButton {
	
	JButton minusButton;
	
	// Constructors
	// This class made it easier to bulk create buttons of the same type.
	public MinusButton(int x, int y) {
		
		minusButton = new JButton("-");
		minusButton.setBounds(x, y, 40, 40);
		minusButton.setFocusable(false);
		minusButton.setEnabled(false);
	}
	
	// Return button method to format the button in the main class.
	public JButton getButton(){
	      return minusButton;
	}
	
}
