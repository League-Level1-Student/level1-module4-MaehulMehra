package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener  {
	int number;
	int number2;
	JFrame frame = new JFrame ();
	JTextField field1 = new JTextField (15);
	JTextField field2 = new JTextField (15);
	JPanel panel = new JPanel ();
	JLabel label = new JLabel ("0");
	JButton addButton = new JButton ("add");
	JButton subButton = new JButton ("subtract");
	JButton mulButton = new JButton ("multiply");
	JButton divButton = new JButton ("divide");
	void makeCalc () {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(field1);
		panel.add(field2);
		panel.add(addButton);
		panel.add(subButton);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(label);
		frame.pack();
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
	}
	void convInputFields () {
		number = Integer.parseInt(field1.getText());
		number2 = Integer.parseInt(field2.getText());
	}
	void add () {
		convInputFields();
		label.setText("" + (number + number2));
	}
	void sub () {
		convInputFields ();
		label.setText(""+ (number - number2));
	}
	void mul () {
		convInputFields ();
		label.setText("" + (number * number2));
	}
	void div () {
		convInputFields ();
		label.setText("" + (number/number2));
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == addButton) {
			add ();
		}
		if (buttonPressed == subButton) {
			sub ();
		}
		if (buttonPressed == mulButton) {
			mul ();
		}
		if (buttonPressed == divButton) {
			div ();
		}
		// TODO Auto-generated method stub
		
	}
}
