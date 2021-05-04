package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class Editor extends JFrame
{
	//Declare
	JTextArea txtEditor;
	
	public Editor()
	{
		//Initialise the component
		txtEditor = new JTextArea(60,90);
		txtEditor.setFont(new Font("Serif", Font.PLAIN, 30));
	
		add(txtEditor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	public static void main(String[] ik)
	{
		Editor sh = new Editor();
		sh.setSize(400,500);
		sh.setVisible(true);
		sh.setTitle("My Text Editor App");
		sh.setResizable(true);
	}
}
