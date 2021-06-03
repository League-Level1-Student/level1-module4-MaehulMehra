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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	Icon cherryIcon;
	Icon limeIcon;
	Icon orangeIcon;
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JLabel label1 = new JLabel ();
	JLabel label2 = new JLabel ();
	JLabel label3 = new JLabel ();
	JButton button = new JButton ("SPIN");
	Random ran = new Random ();
	int slot;
	void makeSpinner () {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		cherryIcon = createLabelImage ("cherry-java.jpg");
		limeIcon = createLabelImage ("limejava.png");
		orangeIcon = createLabelImage ("orangejava.jpg");
		setIcon ();
		frame.pack();
		button.addActionListener(this);
	}
	void setIcon () {
		slot = ran.nextInt(3);
		if (slot == 0) {
			label1.setIcon(cherryIcon);
		}
		else if (slot == 1) {
			label1.setIcon(limeIcon);
		}
		else if (slot == 2) {
			label1.setIcon(orangeIcon);
		}
		slot = ran.nextInt (3);
		if (slot == 0) {
			label2.setIcon(cherryIcon);
		}
		else if (slot == 1) {
			label2.setIcon(limeIcon);
		}
		else if (slot == 2) {
			label2.setIcon(orangeIcon);
		}
		slot = ran.nextInt (3);
		if (slot == 0) {
			label3.setIcon(cherryIcon);
		}
		else if (slot == 1) {
			label3.setIcon(limeIcon);
		}
		else if (slot == 2) {
			label3.setIcon(orangeIcon);
		}
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
		if (label1.getIcon () == label2.getIcon () && label1.getIcon() == label3.getIcon()) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
		setIcon ();
		frame.pack();
		// TODO Auto-generated method stub
		
	}
}
