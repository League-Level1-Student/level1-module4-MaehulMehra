package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JLabel label1 = new JLabel ();
	JLabel label2 = new JLabel ();
	JLabel label3 = new JLabel ();
	JButton button = new JButton ("SPIN");
	Random ran = new Random ();
	int slot;
	void makeSpinner () {
		slot = ran.nextInt(3);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		frame.pack();
		button.addActionListener(this);
	}
	private Icon createLabelImage(String fileName) {
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return null;
	}
	Icon icon = new ImageIcon(imageURL);
	return icon;
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
