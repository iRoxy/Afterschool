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
public class GameItems
{
//Instance variable for the item's name
private String itemName;

/** Method: getName
 *  Returns the name of the item
 * 
 * @return itemName
 */
public String getItemName()
{
	return itemName;
}
/** Method: setName
 *  
 *  Sets the name of the item
 *  
 *  @param name
 */
public void setItemName(String name)
{
	this.itemName = name;
}

 //ArrayList that adds and stores all of the items that appear in the game
 public ArrayList<String> itemList = new ArrayList<>();
 {
 itemList.add("Enery drink");	 
 itemList.add("Old Plunger");
 itemList.add("School Key");
 itemList.add("Fisherman's Journal");
 itemList.add("Crooked Stick");
 itemList.add("Paper clip");
 itemList.add("Yo Yo String");
 itemList.add("Old Gate Key");
 itemList.add("Rope");
 itemList.add("FlashLight");
 itemList.add("Rope");
 itemList.add("Wallet");
 itemList.add("A Piece of Bread");
 itemList.add("Airsoft Gun");	 
 }

}