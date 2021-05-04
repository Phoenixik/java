package gui;

import javax.swing.*;
import java.awt.*;

public class Text extends JFrame{
	
	
	JTextArea mytextarea;
	JLabel mylb;
	JButton myb;
	JTextField mytextfield;
	
	public Text() {
		mylb = new JLabel("Enter Username");
		mytextarea = new JTextArea(5,30);
		mytextfield = new JTextField(30);
		myb = new JButton("Find");
		
		setLayout(new FlowLayout());
		
		add(mylb);
		add(mytextfield);
		add(mytextarea);
		add(myb);
	}
	
	public static void main(String[] ik) {
		Text t = new Text();
		t.setTitle("find operation");
		t.setSize(400,450);
		t.setVisible(true);
		t.setResizable(true);
	}
}
