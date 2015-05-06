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
    private static final int[][] VERIFY_DIRECTION = {{0,1},{0,-1},{1,0},{-1,0},
    	{1,1},{-1,-1},{1,-1},{-1,1}};
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
    public void Stack(int column, Piece piece) /**throws IllegalPoisitionException*/{
    	int line;
    	for ( line = NB_LINE-1; line >= 0; line--)
    	{
    		if(this.grid[line][column].equals(Piece.EMPTYSQUARE))
    			break;		
    	}
    	this.grid[line][column] = piece;
    	
    }
    //TODO finir la méthode de verification, algo en cours de réflexion
    /**
     * Verify the alignment 
     * @return True if 4 Piece are align , false else
     */
	public boolean search4Piece()
	{
		 int nbPieces;
		 Piece couleur = Piece.EMPTYSQUARE;
		for (int line = NB_LINE-1; line >= 0; line--)
		{
			nbPieces =0;
			for(int column = 0;column < NB_COLUMN-2;column++)
			{
				if(!this.grid[line][column].equals(Piece.EMPTYSQUARE))
				{
					
					if(this.grid[line][column].equals(this.grid[line][column+1]))
						nbPieces++;
					else 
					{
						nbPieces =0;
						couleur = this.grid[line][column];
					}
					
				}
				else
					nbPieces=0;
				if (nbPieces ==3)
					return true
			}
		}
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
