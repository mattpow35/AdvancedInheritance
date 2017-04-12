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
			results += "This pizza item is a " + currentPizza.getClass().getName();
			currentPizza.toss();
			if (currentPizza.hasPineapple())
			{
				results += " and it has pineapple, how sad. ";	
			}
			else
			{
				results += " and thank goodness it lacks pineapple. ";
			}
			
			for (int i = 0; i < myPizzas.size(); i ++)
			{
				currentPizza.setPepporoni(i);
			}
			results += " This pizza item also has " + currentPizza.getPepporoni() + " pieces of Pepporoni.";
			
			if (currentPizza instanceof DrPepper)
			{
				results += " This pizza item is actually also a DrPepper!";
			}
		}
		results += "\n";
		
		return results;
	}
	
	public void start()
	{
		
	}

}
