import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame {



	JLabel label = new JLabel();;
	JRadioButton[] radioButtonsArray = new JRadioButton[4];
	JButton nextButton = new JButton("Next");
	ButtonGroup bg = new ButtonGroup();

	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	public Test() {

		label.setText("Que1: Which one among these is not a datatype");
		add(label);

		for (int i = 0; i < 4; i++) {
			radioButtonsArray[i] = new JRadioButton();
			add(radioButtonsArray[i]);
			bg.add(radioButtonsArray[i]);
		}

		add(nextButton);
		
		label.setBounds(30, 40, 450, 20);
		radioButtonsArray[0].setBounds(50, 80, 100, 20);
		radioButtonsArray[1].setBounds(50, 110, 100, 20);
		radioButtonsArray[2].setBounds(50, 140, 100, 20);
		radioButtonsArray[3].setBounds(50, 170, 100, 20);
		nextButton.setBounds(100, 240, 100, 30);
		
		radioButtonsArray[0].setText("int");
		radioButtonsArray[1].setText("Float");
		radioButtonsArray[2].setText("boolean");
		radioButtonsArray[3].setText("char");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

}
