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
		System.out.println("My monster has this many Legs " + firstMonster.getLegCount());
		System.out.println("Mr.Fluffy has no nose " + firstMonster.getnoseCount());
		System.out.println("Mr FLuffy has no belly button " + firstMonster.gethasBellyButton());
	}
	/* monster name is Fluffy
	 * has 2 antenna
	 * has 4 legs
	 * has 0 nose
	 * has 2 eyes
	 * does not have a belly button 
	 */




}
