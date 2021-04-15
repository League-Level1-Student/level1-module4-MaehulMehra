package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton jokeButton = new JButton ("Joke");
	JButton punchline = new JButton ("Punchline");
	void makeButtons (){
		frame.setVisible(true);
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(punchline);
		frame.pack();
		jokeButton.addActionListener(this);
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == jokeButton) {
			JOptionPane.showMessageDialog(null, "Why was 9 scared of 7?");
		}
		else if (buttonPressed == punchline) {
			JOptionPane.showMessageDialog (null, "Because 7 ate (8) 9");
		}
		// TODO Auto-generated method stub
		
	}
}
