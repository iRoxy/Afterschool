import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * @author Raquel Lawrence
 */

public class Puzzle 
{
	
	private String puzzle;
	private Map<String, String> puzzles;
	
	
	/**Method: empty Puzzle constructor
	 * Empty puzzle constructor
	 */
	public Puzzle()
	{
		puzzles = puzzles();
	}
	
	
	/**Method: Puzzle constructor with parameters 
	 * Puzzle constructor that creates a puzzle object with a riddle
	 * @param puzzle
	 */
	public Puzzle(String riddle) 
	{
		this.puzzle = riddle;
		
	}
	
	
	/**Method: puzzles
	 * creates a map of puzzles with riddles as the keys
	 * and answers as the values. Used to initialize instance
	 * variable
	 */
	private Map<String, String> puzzles()
	{
		Map<String, String> puzzle = new HashMap<String, String>();
		puzzle.put("Here is a puzzle", "1");
		puzzle.put("Here is a puzzle", "2");
		puzzle.put("Here is a puzzle", "2");
		puzzle.put("Here is a puzzle", "4");
		puzzle.put("Here is a puzzle", "5");
		puzzle.put("Here is a puzzle", "6");
		
		return puzzle;
	}
	
	
	/**Method: getPuzzle
	 * Retrieves a puzzle object
	 * @return String - the riddle/puzzle
	 */
	public String getPuzzle() 
	{
		return puzzle;
	}

	
	/**Method: setPuzzle
	 * Sets the riddle/puzzle
	 * @param puzzle
	 */
	public void setPuzzle(String puzzle) 
	{
		this.puzzle = puzzle;
	}

	
	/**Method: getPuzzles
	 * Retrieves a map of puzzles
	 * @return
	 */
	public Map<String, String> getPuzzles() 
	{
		return puzzles;
	}

	
	/**Method: setPuzzles
	 * Sets a map of puzzles
	 * @param puzzles
	 */
	public void setPuzzles(Map<String, String> puzzles) 
	{
		this.puzzles = puzzles;
	}
	
	
	/**Method: hashcode
	 * Creates hashcodes for puzzle objects
	 */
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((puzzle == null) ? 0 : puzzle.hashCode());
		result = prime * result + ((puzzles == null) ? 0 : puzzles.hashCode());
		return result;
	}

	/**Method: equals
	 *  Determines whether instances of puzzle objects 
	 *  are equal to each other
	 */
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puzzle other = (Puzzle) obj;
		if (puzzle == null) 
		{
			if (other.puzzle != null)
				return false;
		} 
		else if (!puzzle.equals(other.puzzle))
			return false;
		if (puzzles == null) 
		{
			if (other.puzzles != null)
				return false;
		} 
		
		else if (!puzzles.equals(other.puzzles))
			return false;
		return true;
	}

	/**Method: checkAnswer
	 * This code checks the the answer given by the user
	 * @param answer
 	 * @return turns whether answer is correct
 	 */
	private boolean checkAnswer(String answer)
	{
		boolean isCorrect;
		if(puzzles.containsValue(answer))
		{
			isCorrect = true;
		}
		
		else
		{
			isCorrect = false;
		}
		return isCorrect;
	}
	
	/**Method: giveRiddle
	 * This method prints a riddle and takes answer from the user
	 * and then removes that riddle from the map of puzzles
	 */
	public void giveRiddle()
	{
		Iterator<Map.Entry<String, String>> iterator = puzzles.entrySet().iterator() ;
		
		if(iterator.hasNext())
		{
			Map.Entry<String, String> std = iterator.next();
			//System.out.println(puzzles.size());
			String key = std.getKey();
			System.out.println("Here is your riddle: " + key);
			//String answer = std.getValue();
			String line = FileIO.readIn();
			if(checkAnswer(line))
			{
				puzzles.remove(key);
				System.out.println(puzzles.size());
			}
			
			else
			{
				System.out.println("I'm sorry, your answer was incorrect! Please try again");
			}
				
		}
		
	}
}
