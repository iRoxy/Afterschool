import java.util.ArrayList;

/**
 * @author Raquel Lawrence, Mustafa Kamara & Elisha Patterson
 */

public class Room implements Comparable<Room>
{
	private String name;
	private String desc;
	private Monster monster;
	private NPC npc;
	private Item item;
	private enum REGION {MUDDYPOND,ZONE,YARD};
	private ArrayList<Room> map;

	/**Method: Empty constructor
	 * Empty constructor that creates map of rooms
	 */
	public Room()
	{
		map = createRooms();
	}

	/**Method: Constructor
	 * Constructs an instance of a room object
	 * @param name - name of the room
	 * @param desc - description of room
	 * @param monster - monster in room
	 * @param npc - npc in room
	 * @param item - item in room
	 * @param region - region of where room is
	 */
	public Room(String name, String desc, Monster monster, NPC npc, Item item, REGION region)
	{
		this.name = name;
		this.desc = desc;
		this.monster = monster;
		this.npc = npc;
		this.item = item;
	}

	/**Method: getName
	 * Retrieves the name of the room
	 * @return string - name of room
	 */
	public String getName() 
	{
		return name;
	}

	/**Method: setName
	 * Sets the name of the room
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**Method: getDesc
	 * Retrieves the description of a room
	 * @return
	 */
	public String getDesc() 
	{
		return desc;
	}

	/**Method: setDesc
	 * Sets the description of a room
	 * @param desc - description of room 
	 */
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}

	/**Method: getMonster
	 * Retrieves a monster in a room
	 * @return monster - monster in room
	 */
	public Monster getMonster() 
	{
		return monster;
	}

	/**Method: setMonster
	 * Sets a monster in a room
	 * @param monster - monster in room
	 */
	public void setMonster(Monster monster) 
	{
		this.monster = monster;
	}

	/**Method: getNPC
	 * Retrieves an NPC of a room
	 * @return npc - an npc in a room
	 */
	public NPC getNpc() 
	{
		return npc;
	}

	/**
	 * 
	 * @param npc
	 */
	public void setNpc(NPC npc) 
	{
		this.npc = npc;
	}

	/**Method: getItem
	 * Retrieves item in room
	 * @return item - item in room
	 */
	public Item getItem() 
	{
		return item;
	}

	/**Method: setItem
	 * Sets item of a room
	 * @param item - item in room
	 */
	public void setItem(Item item) 
	{
		this.item = item;
	}


	/**Method: createRooms
	 * Creates individual rooms with a variety of objects
	 * and puts them into an arraylist that serves a map
	 * @return
	 */
	public ArrayList<Room> createRooms()
	{
		ArrayList<Room> rooms = new ArrayList<Room>();

		//School Zone
		rooms.add(new Room("Room 1", "Classroom ", null, null, new Item("Energy Drink ", 100), REGION.ZONE));
		rooms.add(new Room("Room 2", "Outside of classroom ",  null , new NPC("Angry Janitor ", true), null, REGION.ZONE));
		rooms.add(new Room("Room 3", "Hallway ",  new Monster("School Bully ", 40), null, null, REGION.ZONE));
		rooms.add(new Room("Room 4", "2nd Hallway ", null, null, null, REGION.ZONE));
		rooms.add(new Room("Room 5", "Restroom ",  new Monster("Angry Janitor ", 40), null, new Item("Old plunger", 30), REGION.ZONE));
		rooms.add(new Room("Room 6", "Gym ", null, null, null, REGION.ZONE));
		rooms.add(new Room("Room 7", "School Entrance ", null, null, null, REGION.ZONE));
		rooms.add(new Room("Room 8", "Front Office ", null, new NPC("Bored clerk ", true), null, REGION.ZONE));
		rooms.add(new Room("Room 9", "Principalís Office ",new Monster("Principle O'Shag-Hennessy",80 ), null, new Item("School Key ", 100), REGION.ZONE));
		rooms.add(new Room("Room 10", "Outside School ", null, npc = new NPC("Gamer Kid", true), null, REGION.ZONE));

		//Muddy pond
		rooms.add(new Room("Room 11", "Big pond ", null, null, new Item("Fishermanís Journal", 60), REGION.MUDDYPOND));
		rooms.add(new Room("Room 12", "Deep muddy pond ", new Monster("Flying-Ninja Fish", 120), null, new Item("Energy Drink ", 100), REGION.MUDDYPOND));
		rooms.add(new Room("Room 13", "Deep muddy pond ", null, new NPC("Mr. Jackson ", true), null, REGION.MUDDYPOND));
		rooms.add(new Room("Room 14", "Muddy pond ", new Monster("Run-away Lawn Mower ", 60), null,null, REGION.MUDDYPOND));
		rooms.add(new Room("Room 15", "Polishing muddy pond ", null, new NPC("MindMaster " ,true), new Item("Crooked Stick ", 40), REGION.MUDDYPOND));
		rooms.add(new Room("Room 16", "Flat yard ", null, null, new Item("Paperclip ", 20), REGION.MUDDYPOND));
		rooms.add(new Room("Room 17", "Raw Sewage Stabilization Pond ",  new Monster("Giant Salamander", 140), null, null, REGION.MUDDYPOND));
		rooms.add(new Room("Room 18", "Green muddy pond ", null,  new NPC("Old Crazy Fisherman", true),  null, REGION.MUDDYPOND));
		rooms.add(new Room("Room 19", "Third muddy pond ", null,  new NPC(),  new Item("old gate key ", 60), REGION.MUDDYPOND));
		rooms.add(new Room("Room 20", "Red Iron Gate",  new Monster("Noodliní Jim, The Master Fisherman ",160), null, null, REGION.MUDDYPOND));

		//Region yard 
		rooms.add(new Room("Room 21", "Flat yard ", null, null,  new Item("Rope, Flash light, Rope ", 100), REGION.YARD));
		rooms.add(new Room("Room 22", "Dark muddy yard ", new Monster("Bear ", 180), null,  new Item("Energy Drink ", 100), REGION.YARD));
		rooms.add(new Room("Room 23", "Rail yard ", null, null, null, REGION.YARD));
		rooms.add(new Room("Room 24", "Dump yard ",  new Monster("Snake ", 50), null, new Item("Knockout Gas ", 150), REGION.YARD));
		rooms.add(new Room("Room 25", "Second gray yard ", null, new NPC("Angry Neighbor ", true), null, REGION.YARD));
		rooms.add(new Room("Room 26", "Grass yard", new Monster("Red Fox ", 60), null, new Item("Loaf of bread ", 200), REGION.YARD));
		rooms.add(new Room("Room 27", "Second dump yard ",  new Monster("German Shepherd ", 80), null, new Item("Airsoft Gun ", 100), REGION.YARD));
		rooms.add(new Room("Room 28", "Third dump yard ",  new Monster("Herd of Wolves ", 90),null, null, REGION.YARD));
		rooms.add(new Room("Room 29", "Fourth dump yard ", new Monster("Aggressive Bird " , 200), null, null, REGION.YARD));
		rooms.add(new Room("Room 30", "Final dump yard ", null,  new NPC("GateKeeper", true), null, REGION.YARD));



		return rooms;
	}


	/**Method: getMap
	 * Retrieves the arraylist of all the rooms
	 * @return arraylist - map of rooms
	 */
	public ArrayList<Room> getMap() 
	{
		return map;
	}

	/**Method: setMap
	 * Sets the arraylist of all the rooms
	 * @param map - arraylist of rooms
	 */
	public void setMap(ArrayList<Room> map) 
	{
		this.map = map;
	}

	/**Method: compareTo
	 * Compares objects of room to see if they are equal
	 */
	@Override
	public int compareTo(Room o) 
	{
		final int equal = 0;
		final int notEqual = 1;

		if(this.getName().equals(o.getName()))
		{
			return equal;
		}

		else
		{
			return notEqual; 
		}
	}

	/**Method: nextRoom
	 * Moves a user forward to the next room
	 * @param theMap - the map of all the rooms
	 * @param player - the user 
	 */
	public static void nextRoom(ArrayList<Room> theMap, User player)
	{
		Room room = null;
		Room currentRoom = player.getCurrentRoom();
		int lastRoom = theMap.size() -1; 
		if(currentRoom != theMap.get(lastRoom))
		{
			for(int i = 0; i < theMap.size(); i++)
			{
				Room roomInList = theMap.get(i);
				if(roomInList.compareTo(currentRoom) == 0 && i != (theMap.size() - 1))
				{
					room = theMap.get(i + 1);
					player.setCurrentRoom(room);
				}
			}
		}


		else
		{
			System.out.println("You have reached the end of the road");

		}
	}

	/**Method: previousRoom
	 * Returns a user back to the previous room
	 * @param theMap - the map of all the rooms
	 * @param player - the user 
	 */
	public static void previousRoom(ArrayList<Room> theMap, User player)
	{
		Room room = null;
		Room currentRoom = player.getCurrentRoom();

		for(int i = 0; i < theMap.size(); i++)
		{
			Room roomInList = theMap.get(i);
			if(roomInList.compareTo(currentRoom) == 0 && i != 0)
			{
				room = theMap.get(i - 1);
				player.setCurrentRoom(room);
			}

		}

	}

}
