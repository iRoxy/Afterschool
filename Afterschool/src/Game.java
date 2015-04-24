/**
 * @author Raquel Lawrence
 */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Game
{
	private FileReader reader;
	private BufferedReader bfread;
	private File saveFile = new File("save.txt");
	private User player;
	private Room overallRoom;
	private Puzzle puzzle;
	
	/**Method: Game constructor
	 * This method constructs a game object
	 * @throws IOException 
	 */
	public Game(User player, Room overallRoom, Puzzle puzzle) 
	{
		
		this.player = player;
		this.overallRoom = overallRoom;
		this.puzzle = puzzle;
		
	}
	

	/**Method: getSaveFile
	 * Retrieves a text file
	 * @return a file
	 */
	public File getSaveFile() 
	{
		return saveFile;
	}


	/**Method: setSaveFile
	 * Sets a file
	 * @param saveFile
	 */
	public void setSaveFile(File saveFile) 
	{
		this.saveFile = saveFile;
	}
	
	/**Method: getUser
	 * Retrieves the user object for the
	 * game
	 * @return the user object
	 */
	public User getPlayer() 
	{
		return player;
	}

	/**Method: setPlayer
	 * This method sets the player object for
	 * the Game class
	 * @param player - the user object
	 */
	public void setPlayer(User player) 
	{
		this.player = player;
	}
	
	/**Method: getOverallRoom
	 * Retrieves the room object for the 
	 * Game class
	 * @return overallRoom object 
	 */
	public Room getOverallRoom() 
	{
		return overallRoom;
	}

	/**Method: setOverallRoom
	 * This method sets the overall room
	 * object for the Game class
	 * @param overallRoom
	 */
	public void setOverallRoom(Room overallRoom) 
	{
		this.overallRoom = overallRoom;
	}
	

	/**Method: getPuzzle
	 * Retrieves the puzzle object for the
	 * Game class
	 * @return
	 */
	public Puzzle getPuzzle() 
	{
		return puzzle;
	}

	/**Method: setPuzzle
	 * Method sets the puzzle object for the
	 * Game class
	 * @param puzzle
	 */
	public void setPuzzle(Puzzle puzzle) 
	{
		this.puzzle = puzzle;
	}


	/**Method: startGame
	 * This method starts the game
	 * @return the created User object
	 */
	public static User startGame()
	{
		
		System.out.println("Please enter your name: ");
		String name = FileIO.readIn();
		User player = new User(name);
		
		return player;
	}
	
	/**Method: exitGame
	 * This method will stop the game
	 */
	public void exitGame()
	{
		System.exit(0);
	}
	
	/**Method: saveGame
	 * This method will save the game
	 */
	public void saveGame(User user)
	{
		
		try 
		{
			FileWriter writer = new FileWriter(saveFile);
			PrintWriter out = new PrintWriter(saveFile);
			out.print(user.toString());
			out.close();
			
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**Method: loadGame
	 * This method will load the game from a previous save
	 */
	public void loadGame()
	{
		String line = null;
		try 
		{
			while((line = bfread.readLine()) !=null)
			{
				System.out.print(line);
			}
			bfread.close();
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**Method: input
	 * This method gets asks for the user input
	 * and calls to a method that uses input
	 * to drive the game
	 */
	public void input()
	{
		String input = FileIO.readIn();
		checkForDirection(input);
		
	}
	
	/**Method: checkForDirection
	 * This method is a private method used within another
	 * method. Uses user input to perform a variety 
	 * of actions that drive the game
	 */
	private void checkForDirection(String input)
	{
		ArrayList<Room> map = getOverallRoom().getMap();
		User player = getPlayer();
		
		if(input.equalsIgnoreCase("forward"))
		{
			Room.nextRoom(map, player);
			System.out.println("You are now in: " + player.getCurrentRoom().getName());
		}
		
		else if(input.equalsIgnoreCase("back"))
		{
			Room.previousRoom(map, player);
			System.out.println("You are now in " + player.getCurrentRoom().getName() + " once again");
		}
		
		else if(input.equalsIgnoreCase("exit"))
		{
			exitGame();
		}
		
		else if(input.equalsIgnoreCase("help"))
		{
			System.out.println("Hey, you went for help");
		}
		
		else if (input.equalsIgnoreCase("save"))
		{
			saveGame(getPlayer());
		}
		
		else if(input.equalsIgnoreCase("help"))
		{
			Help.howToPlay();
		}
		
		else
		{
			System.out.println("Please enter the commands either: forward, back, exit, help or save");
		}
	}
	
	/**Method: puzzleScenario
	 * This method gives the user a riddle to solve
	 * until correct
	 */
	public void puzzleScenario()
	{
		NPC npc = getPlayer().getCurrentRoom().getNpc();
		Puzzle puzzle = getPuzzle();
		npc.talk();
		
		if(npc.isHasRiddle())
		{
			Puzzle.giveRiddle(puzzle);
			npc.setHasRiddle(false);
		}
		
		else
		{
			System.out.println("\nSorry, I don't have riddles");
		}

	}
}
