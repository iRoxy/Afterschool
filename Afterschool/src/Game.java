/**
 * @author Raquel Lawrence
 */

public class Game 
{
	/**Method: Game constructor
	 * This method constructs a game object
	 */
	public Game()
	{
		
	}
	
	/**Method: startGame
	 * This method starts the game
	 * @return the created User object
	 */
	public User startGame()
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
		
	}
	
	/**Method: saveGame
	 * This method will save the game
	 */
	public void saveGame()
	{
		//Calls to the File/IO class to 
	}
	
	/**Method: loadGame
	 * This method will load the game from a previous save
	 */
	public void loadGame()
	{
		//Calls to the File/IO class to read information for the user, 
		//then in the method, function similarly to startGame method
	}

}
