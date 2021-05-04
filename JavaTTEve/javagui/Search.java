package gui;

import javax.swing.*;
import java.awt.*;

class Search extends JFrame
{
	//Declare
	JLabel lbUsername;
	JTextField txtUsername;
	JButton btnSearch;
	
	public Search()
	{
		//Initialise the component
		lbUsername = new JLabel("Enter Username ");
		txtUsername = new JTextField(25);
		btnSearch = new JButton("Find");

		FlowLayout layout = new FlowLayout();		
		setLayout(layout);
		
		add(lbUsername);
		add(txtUsername);
		add(btnSearch);
	
	}	
	public static void main(String[] ik)
	{
		Search sh = new Search();
		sh.setSize(350,150);
		sh.setVisible(true);
		sh.setTitle("Search operation");
		sh.setResizable(false);
	}
}
