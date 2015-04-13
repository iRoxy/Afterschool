import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Mustafa Kamara
 *
 */

public class MainUserTest
{
    
	 @Test 
	//Test method for MainUser getName
	 
	public void testgetName()
	{
		MainUser user = new MainUser();
		String name = "jon";
		user.setName(name);
		String expectedResult = name;
		String result = user.getName();
		assertEquals(expectedResult,result);
	}
	 
	 @Test 
	//Test method for MainUser getPoints  
	public void testgetPoints()
	{
		MainUser user = new MainUser();
		int points = 100;
		user.setPoints(points);
		int expectedResult = 100;
		int result = user.getPoints();
		assertEquals(expectedResult,result);
	}
    @Test
	public void testgetItemCollection()
	{ 
		MainUser user = new MainUser();
	  	String item = "sword";
	  	user.pickUpItem(item);
		String expectedResult = "sword";
		String result = user.getItemColllection(); 
		assertEquals(expectedResult,result);
	}

}
