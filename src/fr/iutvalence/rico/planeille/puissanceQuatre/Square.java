package fr.iutvalence.rico.planeille.puissanceQuatre;

/**
 * The enumeration represents the 3 possibilities 
 * @author ricos
 * @version 0.1 
 */
public enum Square{
	/**
	 * This is empty square :)
	 */
	EMPTYSQUARE,
	/**
	 * This is red piece :)
	 */
	REDPIECE,
	/**
	 * This is yellow piece :)
	 */
	YELLOWPIECE;
	
	public String ToString() throws SquareNotDefinedException 
	{
		if (this == EMPTYSQUARE)
			return "V";
		if (this == REDPIECE)
			return "R";
		if (this == YELLOWPIECE)
			return "Y"; 
		throw new SquareNotDefinedException();
		
		
	}

}
