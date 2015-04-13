import static org.junit.Assert.*;

import org.junit.Test;


public class MonstersTest
{

	@Test
	//Test method for Monsters getName
	public void testgetName()
	{
		Monsters creature = new Monsters();
		String name = "snake";
		creature.setName(name);
		String expectedResult = name;
		String result = creature.getName();
		assertEquals(expectedResult,result);
	}
	 
	 @Test 
	//Test method for Monsters getPoints  
	public void testgetPoints()
	{
		 Monsters creature = new Monsters();
		int points = 100;
		creature.setPoints(points);
		int expectedResult = 100;
		int result = creature.getPoints();
		assertEquals(expectedResult,result);
	}

}
