package part2;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class PlusButton extends JButton {
	
	JButton addButton;
	
	// Constructors
	// This class made it easier to bulk create buttons of the same type.
	public PlusButton(int x, int y) {
		
		addButton = new JButton("+");
		addButton.setBounds(x, y, 40, 40);
		addButton.setFocusable(false);
		
		
	}
	
	// Return button method to format the button in the main class.
	public JButton getButton(){
	      return addButton;
	      
	}

}
