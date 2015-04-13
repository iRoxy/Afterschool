import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Mustafa Kamara
 *
 */

public class GameItemsTest
{
	@Test
	//Testing method for getItemName
	public void testgetName()
	{
		GameItems item = new GameItems();
		String itemNam = "spear";
		item.setItemName(itemNam);
		String expectedResult = itemNam;
		String result = item.getItemName();
		assertEquals(expectedResult,result);
	}
	 
}
