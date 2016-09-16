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
		
	
	}
	
	/* monster name is Fluffy
	 * has 2 antenna
	 * has 4 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button 
	 */




}
