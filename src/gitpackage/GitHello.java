package gitpackage;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GitHello {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Huhu");
		frame.setLayout(new BorderLayout());
		frame.add(new JLabel("Hallo Welt"));
		frame.pack();
		frame.setVisible(true);
		

	}

}
