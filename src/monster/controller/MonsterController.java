package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Fluffy", 2, 4, 0, 2, false);
	}

	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("here is mine " + firstMonster);
	}
	/* monster name is Fluffy
	 * has 2 antenna
	 * has 4 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button 
	 */




}
