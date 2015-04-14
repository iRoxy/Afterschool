/**
 * @author Raquel Lawrence
 */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Game
{
	private FileWriter writer;
	private FileReader reader;
	private BufferedReader bfread;
	private File saveFile = new File("save.txt");
	
	/**Method: Game constructor
	 * This method constructs a game object
	 * @throws IOException 
	 */
	public Game() 
	{
		try 
		{
			writer = new FileWriter(saveFile);
			reader = new FileReader(saveFile);
			bfread = new BufferedReader(reader);
			
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	public FileWriter getWriter() 
	{
		return writer;
	}


	/**
	 * 
	 * @param writer
	 */
	public void setWriter(FileWriter writer) 
	{
		this.writer = writer;
	}


	/**
	 * 
	 * @return
	 */
	public File getSaveFile() 
	{
		return saveFile;
	}


	/**
	 * 
	 * @param saveFile
	 */
	public void setSaveFile(File saveFile) 
	{
		this.saveFile = saveFile;
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
	public void saveGame(User user)
	{
		try 
		{
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
		} 
		
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

