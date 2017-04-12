package inheritance.model;

import javax.swing.JOptionPane;
import inheritance.view.InheritanceFrame;

public class DrPepper implements pizzable
{
	int pepperoniCount;
	private InheritanceFrame baseFrame;
	
	public DrPepper()
	{
		pepperoniCount = 0;
	}
	
	public boolean hasPineapple()
	{
		return false;
	}
	
	public void toss()
	{
		JOptionPane.showMessageDialog(baseFrame, "The DrPepper was tossed like a pizza!!!!!!");
	}
	
	public void setPepperoni(int pepperoniCount)
	{
		this.pepperoniCount = pepperoniCount;
	}
	
	public int getPepperoni()
	{
		return pepperoniCount;
	}

}
