import java.util.Random;
/**Class: MainUser
 * @author: Mustafa Kamara
 * @version 1.0
 * Course : ITEC 3860, Spring 2015
 * Written: April 2 , 2015
 *
 * Class:   Creates the main attributes of the monsters,
 * that will appear in the game.
 * 
 * Purpose: This class will return the name, points, 
 * and the process of how a battle
 * between the player and monster will occur 
 * 
 */

public class Monster 
{
	private String name;
	private int points;
	
	/**Method: Constructor
	 * Constructs an instance of a monster
	 * @param name
	 * @param points
	 */
	public Monster(String name, int points)
	{
		this.name = name;
		this.points = points;
	}

	/**Method: getName
	 * Retrieves the name of a monster
	 * @return string - name of a monster
	 */
	public String getName() 
	{
		return name;
	}

	/**Method: setName
	 * Sets the name of a monster
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**Method: getPoints
	 * Retrieves the points (health) of a monster
	 * @return int - health of a monster
	 */
	public int getPoints() 
	{
		return points;
	}

	/**Method: setPoints
	 * Sets the points (health) of a monster
	 * @param points - health of a monster
	 */
	public void setPoints(int points) 
	{
		this.points = points;
	}
	
	
}
