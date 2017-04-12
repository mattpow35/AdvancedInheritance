package inheritance.model;
import javax.swing.JOptionPane;

public class PepperoniPizza implements pizzable
{
	private boolean hasPineapple;
	private int pepperoni;
	private String name;
	
	public PepperoniPizza()
	{
		hasPineapple = false;
		pepperoni = 25;
		name = "PepaPizza";
	}
	
	public boolean hasPineapple()
	{
		return hasPineapple;
	}
	public int getPepperoni()
	{
		return pepperoni;
	}
	
	public void setPepperoni(int pepperoni)
	{
		this.pepperoni = pepperoni;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void toss()
	{
		JOptionPane.showMessageDialog(null, "You just got tossed");
	}

}
