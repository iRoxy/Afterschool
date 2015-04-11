import java.io.File; 
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Raquel Lawrence
 */

public class FileIO 
{
	private File file;
	
	/**Method: FileIO constructor 
	 * This method constructs a FileIO object and
	 * instantiates a File object
	 */
	public FileIO()
	{
		file = new File("");
	}
	
	
	/**Method: readIn
	 * This method reads in input and stores it
	 * in a string
	 * @return String - the input
	 */
	public static String readIn()
	{
		Scanner in = new Scanner(System.in);
		String line = in.next();
		return line;
	}
	
	
	/**Method: checkForDirection
	 * This method takes a string (a user's input
	 * and matches it against actions allowed)
	 * @param input
	 */
	public void checkForDirection(String input)
	{
		
		if(input.equalsIgnoreCase("search"))
		{
			//Either encounter an NPC or finds an item
		}
		
		if(input.equalsIgnoreCase("use item"))
		{
			
		}
		
		if(input.equalsIgnoreCase("help"))
		{
			
		}
		
		if(input.equalsIgnoreCase("save"))
		{
			
		}
		
		if(input.equalsIgnoreCase("return"))
		{
			
		}
		
		if(input.equalsIgnoreCase("proceed"))
		{
			
		}
	}
}
