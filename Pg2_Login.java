package day15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Pg2_Login {

	public static void main(String[] args) {
		JFrame f = new JFrame("LOGIN PAGE");
		
		JLabel lblusername = new JLabel("USER NAME");
		lblusername.setBounds(50,60,200,40);
		
		final JTextField txtUsername = new JTextField();
		txtUsername.setBounds(300, 60, 200, 40);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setBounds(50,120,200,40);
		
		final JPasswordField txtPassword = new JPasswordField();
		txtPassword.setBounds(300, 120, 200, 40);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.setBounds(300,180,140,30);
		
		
		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String user,pass;
				
				user = txtUsername.getText();
				pass = txtPassword.getText();
				
				if(user.equals("admin") && pass.equals("admin"))
				{
					System.out.println("SUCCESS");
					String infomsg="loginstatus";
					JOptionPane.showMessageDialog(null,"Success",infomsg, JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					System.out.println("RETRY");
					txtUsername.setText("");
					txtPassword.setText("");
				}				
			}
		});
		
		
		
		f.add(lblusername);
		f.add(txtUsername);
		f.add(lblpassword);
		f.add(txtPassword);
		f.add(loginbtn);
		
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}

}
