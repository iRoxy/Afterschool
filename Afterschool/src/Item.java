import java.util.ArrayList;
/**Class: GameItems
 * @author: Mustafa Kamara
 * @version 1.0
 * Course : ITEC 3860, Spring 2015
 * Written: April 2 , 2015
 *
 * Class: Contains all the items in the game inside an ArrayList.
 * 
 * Purpose: It will return the name of the items that were set.
 * 
 */

/**
 * @author Mustafa Kamara
 */

public class Item 
{
	private String name;
	private int points;
	
	/**Method: constructor 
	 *Constructs an instance of an item object
	 * @param name - the name of the item
	 * @param points - the points that it is worth
	 */
	public Item(String name, int points)
	{
		this.name = name;
		this.points = points;
	}

	/**Method: getName
	 * Retrieves the name of the item
	 * @return string - name of item
	 */
	public String getName() 
	{
		return name;
	}

	/**Method: setName
	 * Sets the name of an item
	 * @param name - name of item
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**Method: getPoints
	 * Retrieves the points of the item
	 * @return int - amount of points item is worth
	 */
	public int getPoints() 
	{
		return points;
	}

	/**Method: setPoints
	 * Sets the amount of points of an item
	 * @param points - amount of points of an item
	 */
	public void setPoints(int points) 
	{
		this.points = points;
	}
	
	
}
