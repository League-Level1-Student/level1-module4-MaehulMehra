package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Tweet implements ActionListener {
	JFrame frame = new JFrame ("The Amazing Tweet Retriever");
	JPanel panel = new JPanel ();
	JButton button = new JButton ("Search the Twitterverse");
	JLabel label = new JLabel ();
	JTextField field = new JTextField (15);
	void makeUI () {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(label);
		frame.pack();
		button.addActionListener(this);
	}
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Tweet, tweet");
		//String latestTweet = getLatestTweet (field.getText());
		String latestTweet = "Tweet, tweet";
		label.setText(latestTweet);
		frame.pack();
		// TODO Auto-generated method stub
		
	}
}
