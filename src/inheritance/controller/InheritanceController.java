package inheritance.controller;

import java.util.ArrayList;

import inheritance.model.*;
import inheritance.view.InheritanceFrame;

public class InheritanceController 
{
	private ArrayList<pizzable> myPizzas;
	
	private InheritanceFrame baseFrame;
	
	public InheritanceController()
	{
		baseFrame = new InheritanceFrame(this);
		myPizzas = new ArrayList<pizzable>();
		setupList();
	}
	
	private void setupList()
	{
		myPizzas.add(new DrPepper());
		myPizzas.add(new PepperoniPizza());
		myPizzas.add(new CowboyPizza());
	}
	
	public String doStuffWithList()
	{
		String results = "";
		for (pizzable currentPizza : myPizzas)
		{
			results += "This pizza item is a " + currentPizza.getClass().getSimpleName();
			results += "\n";
			currentPizza.toss();
			if (currentPizza.hasPineapple())
			{
				results += "and it has pineapple, how sad. ";	
			}
			else
			{
				results += "and thank goodness it lacks pineapple. ";
			}
			results += "\n";
			
			if(currentPizza.getPepperoni() == 0)
			{
				currentPizza.setPepperoni(2);
			}
			
		
			results += "This pizza item has " + currentPizza.getPepperoni() + " pieces of Pepporoni.";
			results += "\n";
			
			if (currentPizza instanceof DrPepper)
			{
				results += "This pizza item is actually also a DrPepper!";
				results += "\n";
			}
			results += "" + "\n";
			results += "" + "\n";
		}
	
		
		return results;
	}
	
	public void start()
	{
		
	}

}
