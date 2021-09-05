package day15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Pg3_swings3 {

	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		
		String fruits[]= {"Apple","Mango","Orange"};
		
		final JComboBox cmbfruits = new JComboBox(fruits);
		cmbfruits.setBounds(50, 50, 150, 40);
		
		
		JButton btn = new JButton("CHECK");
		btn.setBounds(50,150, 120,30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String selected = (String) cmbfruits.getItemAt(cmbfruits.getSelectedIndex());
				String infomsg="combo box selected item";
				JOptionPane.showMessageDialog(null,selected,infomsg, JOptionPane.INFORMATION_MESSAGE);
			
			}
		});
	
		j.add(cmbfruits);
		j.add(btn);
		
		j.setLayout(null);
		j.setSize(500, 500);
		j.setVisible(true);
		
	}
}
