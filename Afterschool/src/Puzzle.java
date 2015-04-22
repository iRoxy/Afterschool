import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Raquel Lawrence
 */

public class Puzzle 
{

	private String puzzle;
	private String answer;
	//private Map<String, String> puzzles;
	private static List<ArrayList<Puzzle>> puzzles;



	/**Method: empty Puzzle constructor
	 * Empty puzzle constructor
	 */
	public Puzzle()
	{
		this.puzzles = createPuzzles();
	}


	/**Method: Puzzle constructor with parameters 
	 * Puzzle constructor that creates a puzzle object with a riddle
	 * @param puzzle
	 */
	public Puzzle(String riddle, String answer) 
	{
		this.puzzle = riddle;
		this.answer = answer;

	}


	/**Method: createPuzzles
	 * This method creates a list of puzzles and 
	 * adds them to an arraylist within a list
	 * @return an list of arraylists of puzzles
	 */
	public List<ArrayList<Puzzle>> createPuzzles()
	{
		List<ArrayList<Puzzle>> list = new ArrayList<ArrayList<Puzzle>>();
		List<Puzzle> puz = new ArrayList<Puzzle>();
		puz.add(new Puzzle("Here is a puzzle1", "1"));
		puz.add(new Puzzle("Here is a puzzle2", "2"));
		puz.add(new Puzzle("Here is a puzzle3", "3"));
		puz.add(new Puzzle("Here is a puzzle4", "4"));
		puz.add(new Puzzle("Here is a puzzle5", "5"));
		puz.add(new Puzzle("Here is a puzzle6", "6"));
		list.add((ArrayList<Puzzle>) puz);


		return list; 
	}



	/**Method: getAnswer
	 * This method retrieves the answer to a puzzle
	 * @return the answer as string
	 */
	public String getAnswer() 
	{
		return answer;
	}


	/**Method: setAnswer
	 * This method sets the answer
	 * @param answer
	 */
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}

	/**Method: getPuzzles
	 * This method retrieves a list of arraylist of
	 * puzzles
	 * @return arraylists within a list
	 */
	public List<ArrayList<Puzzle>> getPuzzles() 
	{
		return puzzles;
	}


	/**
	 * This method sets the arraylist within a list
	 * @param puzzles
	 */
	public void setPuzzles(List<ArrayList<Puzzle>> puzzles) 
	{
		this.puzzles = puzzles;
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
	private static boolean checkAnswer(String puz,String answer)
	{
		boolean isCorrect = false;

		for(int i = 0; i < puzzles.get(0).size(); i++)
		{
			Puzzle puzzle = puzzles.get(0).get(i);
			if(puzzle.getPuzzle().equalsIgnoreCase(puz))
			{
				if(puzzle.getAnswer().equalsIgnoreCase(answer))
				{
					isCorrect = true;
				}
			}
		}

		return isCorrect;
	}

	/**Method: giveRiddle
	 * This method prints a riddle and takes answer from the user
	 * and then removes that riddle from the map of puzzles
	 */
	public static void giveRiddle(Puzzle p)
	{
		boolean check = false;
		List<ArrayList<Puzzle>> list = p.getPuzzles();
		Random rand = new Random();
		int num = rand.nextInt(list.size());

		ArrayList<Puzzle> puz = list.get(0);
		String puzzle = puz.get(num).getPuzzle();

		while(check != true)
		{
			
			System.out.println("Please type in your answer: ");
			String answer1 = FileIO.readIn();
			
			if(checkAnswer(puzzle, answer1))
			{
				System.out.println("Your answer was correct!!");
				puz.remove(num);
				check = true;
			}

			else
			{
				System.out.println("Your answer is not correct!");
			}
		}

	}

}
