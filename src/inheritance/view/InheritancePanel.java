package inheritance.view;

import inheritance.controller.InheritanceController;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.*;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private SpringLayout baseLayout;
	
	public InheritancePanel(InheritanceController basecontroller)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
