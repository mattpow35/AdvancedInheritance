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
			
			for (int i = 0; i < myPizzas.size(); i ++)
			{
				currentPizza.setPepporoni(i);
			}
			results += "This pizza item also has " + currentPizza.getPepporoni() + " pieces of Pepporoni.";
			results += "\n";
			
			if (currentPizza instanceof DrPepper)
			{
				results += "This pizza item is actually also a DrPepper!";
			}
		}
		results += "\n";
		results += "\n";
		
		return results;
	}
	
	public void start()
	{
		
	}

}
