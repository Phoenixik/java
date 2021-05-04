package gui;

import javax.swing.*;
import java.awt.*;

public class Texta extends JFrame{
	
	
	JPasswordField jp;
	JLabel mylb;
	JLabel lb;
	JButton myb;
	JTextField mytextfield;
	
	public Texta() {
		mylb = new JLabel("Enter Username");
		mytextfield = new JTextField(30);
		jp = new JPasswordField(30);
		myb = new JButton("Login");
		lb = new JLabel("Password");
		
		setLayout(new FlowLayout());
		
		add(mylb);
		add(mytextfield);
		add(lb);
		add(jp);
		add(myb);
	}
	
	public static void main(String[] ik) {
		Texta t = new Texta();
		t.setTitle("find operation");
		t.setSize(400,450);
		t.setVisible(true);
		t.setResizable(true);
	}
}