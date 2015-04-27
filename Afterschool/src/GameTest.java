import java.util.ArrayList;

/**
 * @author Raquel Lawrence
 */

public class GameTest 
{
	
		public static void main(String[] args) 
		{
			

			//Initializes the game and creates a player object
			User player = Game.startGame();
			Room overallRoom = new Room();
			Puzzle puzzles = new Puzzle();
			Game game = new Game(player, overallRoom, puzzles);
			
			
			//The map of the rooms the player will traverse through
			ArrayList<Room> theMap = overallRoom.getMap();
			
			//Set character's first room within the map
			player.setCurrentRoom(theMap.get(0));
			
			//Welcomes the player to the game
			System.out.println("\nYou're objective of this game is to battle monsters, solve puzzles and"
					+ " find your way out school");
			
			
			//Initial instructions given to the user
			Help.howToPlay();
			
			//Tells the user which room they are in at start of game
			System.out.println( "\nHi, welcome to " + player.getCurrentRoom().getName());


			//Drives the game and runs all the scenarios
			while(game.getPlayer().getPoints() != 0)
			{
				
				game.input();
				
				//First check if there is a monster
				if(game.getPlayer().getCurrentRoom().getMonster() != null)
				{
					game.monsterBattle();
				}
				
				//First check if there is a NPC
				else if(game.getPlayer().getCurrentRoom().getNpc() != null)
				{
					if(game.getPlayer().getCurrentRoom().getNpc().isHasRiddle())
					{
						game.puzzleScenario();
					}
					else
					{
						game.getPlayer().getCurrentRoom().getNpc().talk();
				
					}
				}
				
	
			}
			
	}

}
