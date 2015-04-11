
/**
 * @author Raquel Lawrence
 */

public class NPC 
{	
	private String name; 
	private boolean hasRiddle;

	/**Method: NPC empty constructor
	 * This method creates an NPC object
	 */
	public NPC()
	{
	}
	
	/**Method: NPC constructor
	 * NPC constructor that creates with name, and riddle
	 * @param name
	 * @param hasRiddle
	 */
	public NPC(String name, boolean hasRiddle)
	{
		this.name = name;
		this.hasRiddle = hasRiddle;
	}
	
	/**Method: getName
	 * This method retrieves the name of an NPC
	 * @return String - NPC name
	 */
	public String getName() 
	{
		return name;
	}

	/**Method: setName
	 * Sets the name of an NPC
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**Method: isHasRiddle
	 * This retrieves whether a NPC comes with a riddle
	 * @return boolean - whether an NPC has a riddle
	 */
	public boolean isHasRiddle() 
	{
		return hasRiddle;
	}

	/**Method: setHasRiddle
	 * This method sets whether a NPC has a riddle
	 * @param hasRiddle
	 */
	public void setHasRiddle(boolean hasRiddle) 
	{
		this.hasRiddle = hasRiddle;
	}
	
	


}
