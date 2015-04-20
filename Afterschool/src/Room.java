import java.util.ArrayList;

public class Room implements Comparable<Room>
{
	private String name;
	private String desc;
	private Monster monster;
	private NPC npc;
	private Item item;
	private enum REGION {MUDDYPOND,ZONE,YARD};
	private ArrayList<Room> map;
	
	public Room()
	{
		map = createRooms();
	}
	
	public Room(String name, String desc, Monster monster, NPC npc, Item item, REGION region)
	{
		this.name = name;
		this.desc = desc;
		this.monster = monster;
		this.npc = npc;
		this.item = item;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDesc() 
	{
		return desc;
	}

	public void setDesc(String desc) 
	{
		this.desc = desc;
	}

	public Monster getMonster() 
	{
		return monster;
	}

	public void setMonster(Monster monster) 
	{
		this.monster = monster;
	}

	public NPC getNpc() 
	{
		return npc;
	}

	public void setNpc(NPC npc) 
	{
		this.npc = npc;
	}

	public Item getItem() 
	{
		return item;
	}

	public void setItem(Item item) 
	{
		this.item = item;
	}
	
	
	public ArrayList<Room> createRooms()
	{
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(new Room("Room 1", "", null, null, null,REGION.ZONE));
		rooms.add(new Room("Room 2", "", null, null, null,REGION.ZONE));
		rooms.add(new Room("Room 3", "", null, null, null,REGION.ZONE));
		rooms.add(new Room("Room 4", "", null, null, null,REGION.ZONE));
		rooms.add(new Room("Room 5", "", null, null, null,REGION.MUDDYPOND));
		rooms.add(new Room("Room 6", "", null, null, null,REGION.MUDDYPOND));
		rooms.add(new Room("Room 7", "", null, null, null,REGION.MUDDYPOND));
		rooms.add(new Room("Room 8", "", null, null, null,REGION.YARD));
		rooms.add(new Room("Room 9", "", null, null, null,REGION.YARD));
		rooms.add(new Room("Room 10", "", null, null, null,REGION.YARD));
		
		return rooms;
	}
	

	public ArrayList<Room> getMap() 
	{
		return map;
	}

	public void setMap(ArrayList<Room> map) 
	{
		this.map = map;
	}

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
	
	public void nextRoom(ArrayList<Room> theMap, User player)
	{
		Room room = null;
		Room currentRoom = player.getCurrentRoom();
		for(int i = 0; i < theMap.size(); i++)
		{
			Room roomInList = theMap.get(i);
			if(roomInList.compareTo(currentRoom) == 0)
			{
				room = theMap.get(i + 1);
				player.setCurrentRoom(room);
			}
		}
	}

}
