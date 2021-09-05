package day15;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Pg1_sample {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		JButton btn = new JButton("Show");
		btn.setBounds(100, 70, 150, 50);
		
		f.add(btn);
		
		
		f.setSize(500, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
