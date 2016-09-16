package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "MonsterName";
		this.antennaCount = -123456.32;
		this.eyeCount = -65435;
		this.legCount = -98768415;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}

	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}

	public String getName()
	{
		return name;
	}
	
	public boolean gethasBellyButton()
	{
		return hasBellyButton;		
	}
	
	public int getLegCount()
	{
		return legCount;
	}

	public int getnoseCount()
	{
		return noseCount;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}
	
}

