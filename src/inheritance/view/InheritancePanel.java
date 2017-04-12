package inheritance.view;

import inheritance.controller.InheritanceController;
import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private SpringLayout baseLayout;
	private JButton inheritanceButton;
	private JTextArea inheritanceDisplay;
	
	public InheritancePanel(InheritanceController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		inheritanceButton = new JButton("Click to get the info about the Pizza items.");
		inheritanceDisplay = new JTextArea(20, 35);
		baseLayout.putConstraint(SpringLayout.NORTH, inheritanceButton, 26, SpringLayout.SOUTH, inheritanceDisplay);
		baseLayout.putConstraint(SpringLayout.WEST, inheritanceButton, 0, SpringLayout.WEST, inheritanceDisplay);
		baseLayout.putConstraint(SpringLayout.NORTH, inheritanceDisplay, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, inheritanceDisplay, 31, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.add(inheritanceButton);
		this.add(inheritanceDisplay);
		inheritanceDisplay.setEditable(false);
		inheritanceDisplay.setWrapStyleWord(true);
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));

	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		inheritanceButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				inheritanceDisplay.setText(baseController.doStuffWithList());
			
			}
		});
	}

}
