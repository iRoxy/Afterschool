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


import java.util.ArrayList;

/**
 * @author Mustafa Kamara
 */

public class User 
{
	private String name;
	private Room currentRoom;
	private int points;
	private ArrayList<Item> items;

	public User(String name)
	{
		this.name = name;
		currentRoom = new Room("Room 1", "", null, null, null, null);
		points = 150;
		items = new ArrayList<Item>();
	}

	/**Method: getName
	 * Retrieves the name of the user
	 * @return string - name
	 */
	public String getName() 
	{
		return name;
	}

	/**Method: setName
	 * Sets the name of the user
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**Method: getPoints
	 *Retrieves the points (health) of the user
	 * @return int- the amount of health
	 */
	public int getPoints() 
	{
		return points;
	}

	/**Method: setPoints
	 * Sets the points (health) of the user
	 */
	public void setPoints(int points) 
	{
		this.points = points;
	}


	/**Method: getItems
	 * Retrieves the items the user holds
	 * @return - arraylist of items
	 */
	public ArrayList<Item> getItems() 
	{
		return items;
	}

	/**Method: setItems
	 * Sets the bag of items the user holds
	 * @param items
	 */
	public void setItems(ArrayList<Item> items) 
	{
		this.items = items;
	}

	/**Method: getCurrentRoom
	 * Retrieves the current room a user is in
	 * @return room - the current room
	 */
	public Room getCurrentRoom() 
	{
		return currentRoom;
	}

	/**Method: setCurrentRoom
	 *Sets the current room a user is in
	 */
	public void setCurrentRoom(Room currentRoom) 
	{
		this.currentRoom = currentRoom;
	}

	/**Method: useItems
	 * This method handles using items, more specifically the
	 * energy drink scenario
	 */
	public void useItems()
	{
		if(!getItems().isEmpty())
		{
			System.out.println("\nYou currently have these following items: ");
			ArrayList<Item> bag = getItems();
			int initialSize = bag.size();
			for(int i = 0; i < initialSize; i++)
			{
				System.out.println("\n" + bag.get(i).getName());
			}
			
			System.out.println("Please enter the name of the item that you want: ");
			String wanted = FileIO.readIn();
	
			for(int i = 0; i < initialSize; i++)
			{
				Item item = bag.get(i);
				if(item.getName().equalsIgnoreCase(wanted))
				{
					int currentPoints = getPoints();
					setPoints(currentPoints + item.getPoints());
					getItems().remove(item);
					System.out.println("Your current health is now: " + getPoints());
				}	
			}

		}

		else
		{
			System.out.println("\nSorry, you don't have any items your bag!");
		}
	}


	/**Method: toString
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		return "User [name=" + name + ", currentRoomName=" + currentRoom.getName()
				+ ", points=" + points + ", listOfItems=" + items.toString() + "]";
	}





}
