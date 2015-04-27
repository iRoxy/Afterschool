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
		puz.add(new Puzzle("What is brown, has a tail and head?", "penny"));
		puz.add(new Puzzle("Poor people have it. Rich people need it. If you eat it you die. What is it?", "Nothing"));
		puz.add(new Puzzle("What comes down but never goes up?", "Rain"));
		puz.add(new Puzzle("I’m tall when I’m young and I’m short when I’m old. What am I?", "candle"));
		puz.add(new Puzzle("A dad and his son were riding their bikes and crashed. Two ambulances came and took them to different hospitals. "
				+ "The man’s son was in the operating room and the doctor said, "
				+ "“I can’t operate on you. You’re my son. Who is the doctor", "mom"));
		puz.add(new Puzzle("What travels around the world but stays in one spot?", "stamp"));
		puz.add(new Puzzle("If I have it, I don’t share it. If I share it, I don’t have it. What is it?", "secret"));
		puz.add(new Puzzle("What can you catch but not throw?", "cold"));
		puz.add(new Puzzle("What starts with the letter “t”, is filled with “t” and ends in “t”?", "teapot"));
		puz.add(new Puzzle(" What is so delicate that saying its name breaks it?", "Silence"));
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


	/**Method: setPuzzles
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
		ArrayList<Puzzle> puz = list.get(0);
		int num = rand.nextInt(puz.size());
		
		String puzzle = puz.get(num).getPuzzle();

		while(check != true)
		{
			System.out.println("\n" + puzzle);
			System.out.println("\nPlease type in your answer: ");
			String answer1 = FileIO.readIn();
			
			if(checkAnswer(puzzle, answer1))
			{
				System.out.println("Your answer was correct!!");
				puz.remove(num);
				check = true;
			}
			
			else if(answer1.equalsIgnoreCase("exit"))
			{
				System.out.println("Thanks for playing!");
				Game.exitGame();
			}

			else
			{
				System.out.println("Your answer is not correct!");
			}
		}

	}

}
