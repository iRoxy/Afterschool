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

public class Monsters
{   
	//Creates a object that will inherit from the Random class
	Random ran = new Random();
	//Instance variables for points and name
	private String name;
	private int points;
	//Creates a object titled user from the MainUser class
    MainUser user1 = new MainUser();
	//Creates a object titled item from the GameItems class
    GameItems items = new GameItems();
	//Creates a object titled mons from the Monsters class
    Monsters mons = new Monsters();

	/** Method: getName
	 *  
	 *  Returns the name of the monster
	 *  
	 *  @return name
	 */
	public String getName()
	{
		return name;
	}

	/** Method: setName
	 *  Sets the name of the monster
	 * 
	 * @param name
	 * 
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/** Method: getPoints
	 *  Returns the points that a monster has
	 * 
	 * @return points
	 */
	public int getPoints()
	{
		return points;
	}

	/** Method: setPoint
	 *  Sets the points of the monster
	 * 
	 * @param points
	 */
	public void setPoints(int points)
	{
		this.points = points;
	}
	/** Method: monsterBattle
	 *  
	 * This method will run a while loop that
	 * takes points away from the user and monster objects.
	 * This loop will continue till either the user 
	 * or monster object's point total reaches zero
	 * 
	 */
	public void monsterBattle()
	{
		while (user1.getPoints() != 0 || mons.getPoints() != 0)
		{
			int num = user1.getPoints();

			int range = ran.nextInt(50 - 30 + 1) + 30;

			int damage = range;
			mons.setPoints(damage);

		}
	}

}
