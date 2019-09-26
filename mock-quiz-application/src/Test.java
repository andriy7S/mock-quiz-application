import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


// Create the GUI Panel
public class Test extends JFrame implements ActionListener{

	JLabel label;
	JRadioButton[] radioButtonsArray = new JRadioButton[5];
	JButton nextButton;
	ButtonGroup bg;

	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	public Test() {

		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		
		for (int i = 0; i < 5; i++) {
			radioButtonsArray[i] = new JRadioButton();
			add(radioButtonsArray[i]);
			bg.add(radioButtonsArray[i]);
		}
		
		nextButton = new JButton("Next");
		nextButton.addActionListener(this);
		add(nextButton);
		set();

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
	
	// Add Action Listener to change screen when Next Button is pressed

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == nextButton) {
			count = count + 1;
			current++;
			set();
		}
	}

	// Update the Question and Answer Options Text
	private void set() {

		if (current == 0) {
			label.setText("Que1: Which one among these is not a datatype");
			radioButtonsArray[0].setText("int");
			radioButtonsArray[1].setText("Float");
			radioButtonsArray[2].setText("boolean");
			radioButtonsArray[3].setText("char");
		}

		if (current == 1) {
			label.setText("Que2: Which class is available to all the class automatically");
			radioButtonsArray[0].setText("Swing");
			radioButtonsArray[1].setText("Applet");
			radioButtonsArray[2].setText("Object");
			radioButtonsArray[3].setText("ActionEvent");
		}

		if (current == 2) {
			label.setText("Que3: Which package is directly available to our class without importing it");
			radioButtonsArray[0].setText("swing");
			radioButtonsArray[1].setText("applet");
			radioButtonsArray[2].setText("net");
			radioButtonsArray[3].setText("lang");
		}

		if (current == 3) {
			label.setText("Que4: String class is defined in which package");
			radioButtonsArray[0].setText("lang");
			radioButtonsArray[1].setText("Swing");
			radioButtonsArray[2].setText("Applet");
			radioButtonsArray[3].setText("awt");
		}

		if (current == 4) {
			label.setText("Que5: Which institute is best for java coaching");
			radioButtonsArray[0].setText("Guru99");
			radioButtonsArray[1].setText("ABC");
			radioButtonsArray[2].setText("XYZ");
			radioButtonsArray[3].setText("123");
		}

		if (current == 5) {
			label.setText("Que6: Which one among these is not a keyword");
			radioButtonsArray[0].setText("class");
			radioButtonsArray[1].setText("int");
			radioButtonsArray[2].setText("get");
			radioButtonsArray[3].setText("if");
		}

		if (current == 6) {
			label.setText("Que7: Which one among these is not a class ");
			radioButtonsArray[0].setText("Swing");
			radioButtonsArray[1].setText("Actionperformed");
			radioButtonsArray[2].setText("ActionEvent");
			radioButtonsArray[3].setText("Button");
		}

		if (current == 7) {
			label.setText("Que8: which one among these is not a function of Object class");
			radioButtonsArray[0].setText("toString");
			radioButtonsArray[1].setText("finalize");
			radioButtonsArray[2].setText("equals");
			radioButtonsArray[3].setText("getDocumentBase");
		}

		if (current == 8) {
			label.setText("Que9: which function is not present in Applet class");
			radioButtonsArray[0].setText("init");
			radioButtonsArray[1].setText("main");
			radioButtonsArray[2].setText("start");
			radioButtonsArray[3].setText("destroy");
		}

		if (current == 9) {
			label.setText("Que10: Which one among these is not a valid component");
			radioButtonsArray[0].setText("JButton");
			radioButtonsArray[1].setText("JList");
			radioButtonsArray[2].setText("JButtonGroup");
			radioButtonsArray[3].setText("JTextArea");
		}

		label.setBounds(30, 40, 450, 20);

		for (int i = 0, j = 0; i <= 90; i += 30, j++) {
			radioButtonsArray[j].setBounds(50, 80 + i, 200, 20);
		}

	}
	
	// Check the results
	private boolean check() {
		
		if(current==0)
			return(radioButtonsArray[1].isSelected());
		if(current==1)
			return(radioButtonsArray[2].isSelected());
		if(current==2)
			return(radioButtonsArray[3].isSelected());
		if(current==3)
			return(radioButtonsArray[0].isSelected());
		if(current==4)
			return(radioButtonsArray[2].isSelected());
		if(current==5)
			return(radioButtonsArray[2].isSelected());
		if(current==6)
			return(radioButtonsArray[1].isSelected());
		if(current==7)
			return(radioButtonsArray[3].isSelected());
		if(current==8)
			return(radioButtonsArray[1].isSelected());
		if(current==9)
			return(radioButtonsArray[2].isSelected());
		
		return false;
	}

}
