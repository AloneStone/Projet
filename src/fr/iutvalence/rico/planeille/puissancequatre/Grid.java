package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * Grid of the game.
 *
 * @author ricos
 * @version 1.0.0
 */
public class Grid {
    /**constant number of column and line*/
    private static final int NB_COLUMN = 7;
    private static final int NB_LINE = 6;

    /**constant direction to verify the piece alignment*/
    private static final int[][] VERIFY_DIRECTION = {{0,1},{0,-1},{-1,1},{1,-1},{1,1},{-1,-1},{1,0}};

    /** Grid of Game represented by a table of piece*/
    private Piece[][] grid;

    /**Constructor of Grid initialized with empty square*/
    public Grid() {
        this.grid = new Piece[NB_LINE][NB_COLUMN];
        for (int line = 0; line < NB_LINE; line++) {
            for (int column = 0; column < NB_COLUMN; column++) {
                grid[line][column] =  Piece.EMPTYSQUARE;
            }
        }
    }
    /** To stack the piece on the grid
     * 
     * @param column choice of the player
     * @param piece the color of the player
     */
    //TODO Exception
    public int stack(int column, Piece piece) /**throws IllegalPoisitionException*/{
    	int line;
    	for ( line = NB_LINE-1; line >= 0; line--)
    	{
    		if(this.grid[line][column].equals(Piece.EMPTYSQUARE))
    			break;		
    	}
    	this.grid[line][column] = piece;
    	return line;
    }

    /**
     * Verify the alignment 
     * @return True if 4 Piece are align , false else
     */
	public boolean search4Piece(int line, int column)
	{
		 int nbPieces = 0;
		 int verifyLine, verifyColumn;
		 for (int nTest = 0; nTest < 7 ;nTest++)
		 {
			 if (nTest% 2 == 0)
				 nbPieces = 0;
			 verifyLine = line;
			 verifyColumn =column;
			 
			while( nbPieces != 3)
			{
				
				if (winDirection(verifyLine, verifyColumn, nTest))
				{
					nbPieces++;
				}
				else 
					break;
				
				verifyLine += VERIFY_DIRECTION[nTest][0];
				verifyColumn += VERIFY_DIRECTION[nTest][1];
					
			}
			if (nbPieces ==3)
				return true;
		 }
		 return false;
		 
	}
	/**
	 * 
	 * @param verifyLine
	 * @param verifyColumn
	 * @param nDirection
	 * @return
	 */
	public boolean winDirection (int verifyLine, int verifyColumn, int nDirection )
	{
		//System.err.printf("%d/%d/%d%n", verifyLine, verifyColumn, nDirection);
		int verifyLineNext = verifyLine+VERIFY_DIRECTION[nDirection][0];
		int verifyColumnNext = verifyColumn+VERIFY_DIRECTION[nDirection][1];
		//System.err.printf("%d/%d%n", verifyLineNext, verifyColumnNext);
		if((verifyLineNext < 0 || verifyLineNext >=NB_LINE) || (verifyColumnNext < 0 || verifyColumnNext >= NB_COLUMN))
			 return false;
		return this.grid[verifyLine][verifyColumn].equals(this.grid[verifyLineNext][verifyColumnNext]);
	}
	
    
    @Override
    public String toString(){
    	 String gridRepresentation ="";
    	 for (int line = 0; line < NB_LINE; line++) {
    		 gridRepresentation += "|";
             for (int column = 0; column < NB_COLUMN; column++) {
                 gridRepresentation += "|"+this.grid[line][column]+"|";
             }
             gridRepresentation += "|\n";
    }
    	 return gridRepresentation;
    }
}
