package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame = new JFrame ("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel ();
	JButton [] buttons = new JButton [24];
	Random ran = new Random ();
	int mole = ran.nextInt(24);
	int moleClicked = 0;
	void drawButtons (){
		mole = ran.nextInt(24);
		for (int i = 0; i < buttons.length; i ++) {
			buttons [i] = new JButton (); 
			panel.add(buttons [i]);
			buttons [i].addActionListener(this);
		}
		buttons [mole].setText("mole");
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(100, 200);
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    } 
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttons[mole] != buttonPressed) {
			//speak ("You missed");
			frame.dispose();
			drawButtons ();
		}
		else if (buttons [mole] == buttonPressed) {
			moleClicked ++;
			frame.dispose();
			drawButtons();
		}
		// TODO Auto-generated method stub
		
	}
}
