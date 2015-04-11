import java.util.ArrayList;
/**Class: MainUser
 * @author: Mustafa Kamara
 * @version 1.0
 * Course : ITEC 3860, Spring 2015
 * Written: April 2 , 2015
 *
 * Class: Creates the main attributes of the player. 
 *  
 * Purpose: This class will return the name, points, 
 * and the process of how a battle
 * between the player and monster will occur 
 */
public class MainUser
{   //Instance variables for points and name
	private String name;
	private String itemC;
	private int points;
	//Creates a object titled item from the GameItems class
	GameItems item = new GameItems();
	//Empty  ArrayList for adding items
	ArrayList<String>itemCollect = new ArrayList<>();
	{	
    }	
	/** Method: getName
	 *  Returns the name of the user
	 * 
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	/** Method: setName
	 *  Sets the name of the user
	 * 
	 * @param name 
	 * 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/** Method: getPoint
	 *  Returns the point of the user
	 * 
	 * @return points 
	 */
	public int getPoints()
	{
		return points;
	}
	
	/** Method: setPoint
	 *  Sets the point of the user
	 * 
	 * @param points
	 */
	public void setPoints(int points)
	{
		this.points = points;
	}	

	/** Method: pickUpItem
	 * 
	 * This method will simply add an item to an
	 * ArrayList 
	 *
	 * @param itemTool
	 */
	public void pickUpItem(String itemTool)
	{
		itemCollect.add(itemTool);	 
	}
	
	/** Method: getItemCollection
	 * 
	 * This method will first get the items that 
	 * were placed inside the itemCollect list in
	 * the pickUpItem method.
	 * Then it will return those items
	 * 	 
	 * @return itemC
	 */
	public String getItemColllection()
	{
		 for(int index =0; index< itemCollect.size(); index++)
		 {
			 itemCollect.get(index); 
			 itemC = itemCollect.get(index);
		 }
	  
		return itemC;
	}

}




