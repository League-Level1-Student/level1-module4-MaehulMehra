package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton button = new JButton ("translate");
	JTextField field1 = new JTextField (15);
	JTextField field2 = new JTextField (15);
	PigLatinTranslator translator = new PigLatinTranslator ();
	void makeUI () {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		frame.pack();
		button.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String piglatin = field1.getText();
		String piglatin1 = translator.translate(piglatin);
		field2.setText(piglatin1);	
		// TODO Auto-generated method stub
		
	}
}
