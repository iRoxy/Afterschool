import java.awt.Component;
import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Elisha Patterson
 * This is the Room class which contains and manages all the rooms
 * and interaction with those rooms within the After School game.
 * 
 */

public class Room{

	Room roomName;
	String roomDescription;
	Item itemInRoom;
	Monster monsterInRoom;
	NPC npcInRoom;

	/**
	 * @param roomName
	 * @param roomDescription
	 * @param itemInRoom
	 * @param monsterInRoom
	 * @param npcInRoom
	 * 
	 * creating Room constructors
	 */
	public Room(Room roomName, String roomDescription,  Item itemInRoom, Monster monsterInRoom, NPC npcInRoom) {

		this.roomName= roomName;
		this.roomDescription= roomDescription;
		this.itemInRoom= itemInRoom;
		this.monsterInRoom= monsterInRoom;
		this.npcInRoom= npcInRoom;
	}


	public Room() {}
	
	/**
	 * method that contains a list of items
	 * and returns the most current item.
	 *
	 */
	
	/**
	 * method that contains a list of rooms
	 * and returns the most current room.
	 *
	 */
	public String currentRoom(String currentRoom)
	{
		return currentRoom;
	}
	
	public String currentItem(String itemInRoom)
	{
		return itemInRoom;
	}
	
	/**
	 * method that contains a list of monsters
	 * and returns the most current monster.
	 *
	 */
	public String currentMonster(String monsterInRoom)
	{
		return monsterInRoom;
	}
	
	//note: did not make a currentNPC for NPC as there is only one kind of NPC.

	/**
	 * generating getters and setters
	 *
	 */
	public Room getRoomName() {
		return roomName;
	}


	public void setRoomName(Room roomName) {
		this.roomName = roomName;
	}


	public String getRoomDescription() {
		return roomDescription;
	}


	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}


	public Item getItemInRoom() {
		return itemInRoom;
	}


	public void setItemInRoom(Item itemInRoom) {
		this.itemInRoom = itemInRoom;
	}


	public Monster getMonsterInRoom() {
		return monsterInRoom;
	}


	public void setMonsterInRoom(Monster monsterInRoom) {
		this.monsterInRoom = monsterInRoom;
	}


	public NPC getNpcInRoom() {
		return npcInRoom;
	}


	public void setNpcInRoom(NPC npcInRoom) {
		this.npcInRoom = npcInRoom;
	}


	public Room[] getRoomNames() {
		return roomNames;
	}


	public void setRoomNames(Room[] roomNames) {
		this.roomNames = roomNames;
	}

	Room[] roomNames = new Room[30];


	/**stores and returns the room descriptions
	 * 
	 */
	//	public String assignDescription()
	//	{
	//		
	//	}

	/**
	 * @Override
	 * The toString method to display the contents of the room to the user.
	 *
	 */
	public String toString()
	{
		System.out.println("The items in this room are: " + itemInRoom + '\n');
		System.out.println("The monsters in this room are: " + monsterInRoom + '\n');
		System.out.println("The NPC in this room are: " + npcInRoom);

		return null;
	}


public static void main(String[] args)
{
	Room room = new Room();
	System.out.println(room.getNpcInRoom().toString());
	
}
}
