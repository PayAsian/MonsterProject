package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Fluffy", 2, 4, 0, 2, false);
		keyboardInput = new Scanner(System.in);
	}


	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("here is mine " + firstMonster);
		System.out.println("My monster has this many Legs " + firstMonster.geteyeCount());
		System.out.println("Mr.Fluffy has no nose " + firstMonster.getLegCount());
		System.out.println("Mr FLuffy has no belly button " + firstMonster.gethasBellyButton());
		
		System.out.println("Do you want to chang my name??");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the name to be????????");
		String newName = keyboardInput.nextLine();
		firstMonster.setName(newName);
		}
		else
		{
			System.out.println("I get to keep my name grrrrrrr I don\'t like it angry emoji >:(");
		}
		
		System.out.println("Do you want to change the amount of eyes i have??");
		String answer1 = keyboardInput.nextLine();
		
		if(answer1.equalsIgnoreCase("yes"))
		{
			System.out.println("Do you want to change the amount of eyes i have?");
			int newteyeCount = keyboardInput.nextInt();
		firstMonster.seteyeCount(newteyeCount);
		}
		else
		{
			System.out.println("I'm actually ok with is....");
		}
		
		
		System.out.println(firstMonster);
	}
	
	/* monster name is Fluffy
	 * has 2 antenna
	 * has 4 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button 
	 */




}
