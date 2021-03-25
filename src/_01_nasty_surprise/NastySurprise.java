package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton button1 = new JButton ("trick");
	JButton button2 = new JButton ("treat");
	void nasty () {
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button1) {
			showPictureFromTheInternet ("https://images.unsplash.com/photo-1600804340584-c7db2eacf0bf?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NXx8cHVwcHl8ZW58MHx8MHw%3D&ixlib=rb-1.2.1&w=1000&q=80");
		}
		if (buttonPressed == button2) {
			showPictureFromTheInternet ("https://images-na.ssl-images-amazon.com/images/I/61zPpWbIVlL._AC_UX385_.jpg");
		}
		// TODO Auto-generated method stub
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
}
