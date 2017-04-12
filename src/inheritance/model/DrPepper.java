package inheritance.model;

import javax.swing.JOptionPane;
import inheritance.view.InheritanceFrame;

public class DrPepper implements pizzable
{
	int pepporoniCount;
	private InheritanceFrame baseFrame;
	
	public DrPepper()
	{
		pepporoniCount = 0;
	}
	
	public boolean hasPineapple()
	{
		return false;
	}
	
	public void toss()
	{
		JOptionPane.showMessageDialog(baseFrame, "The DrPepper was tossed like a pizza!!!!!!");
	}
	
	public void setPepporoni(int pepporoniCount)
	{
		this.pepporoniCount = pepporoniCount;
	}
	
	public int getPepporoni()
	{
		return pepporoniCount;
	}

}
