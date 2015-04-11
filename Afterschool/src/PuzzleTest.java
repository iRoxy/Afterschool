import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


/**
 * @author Raquel Lawrence
 */


public class PuzzleTest extends Puzzle
{

	public int i = 0;
	
	@Test
	public void checkingPuzzlesKeys()
	{
		Puzzle puzzle = new Puzzle();
		Map<String, String> list = puzzle.getPuzzles();
		
		  for(Map.Entry<String, String> riddle : list.entrySet())
		  {
			  assertEquals("Here is a puzzle", riddle.getKey());

		  }	
	}
	
		
}


