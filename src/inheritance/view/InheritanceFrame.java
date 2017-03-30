package inheritance.view;

import javax.swing.JFrame;
import inheritance.controller.InheritanceController;
import java.awt.Dimension;

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel appPanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new InheritancePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Advanced Inheritance");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
		this.setResizable(false);
	}

}
