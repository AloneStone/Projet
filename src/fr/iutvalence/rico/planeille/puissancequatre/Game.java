package fr.iutvalence.rico.planeille.puissancequatre;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 

/**
 * TODO JAVADOC.
 *
 * @author ricos
 * @version 1.0.0
 */
public class Game {
	/**
	 * The turn of player
	 */
	private Piece playerTurn;
	
	/**
	 * The 2 players
	 */
	private ArrayList<Player> players;
	
	/**
	 * The grid of the game
	 */
	private Grid grid ;
	
	/**
	 * Contructor of game
	 */
	
	private Frame frameGame;
	
	public Game()
	{
		/**
		 * Random number give the first player 
		 */
		Random rand = new Random();
        int firstPlayerIndice = rand.nextInt(1);
        this.playerTurn = Piece.REDPIECE;
		if (firstPlayerIndice == 0)
			this.playerTurn = Piece.YELLOWPIECE;
		
		/**
		 * Create collection of player
		 */
		this.players = new ArrayList<Player>();
		System.out.print("For the red piece ");
		this.players.add(new Player(Piece.REDPIECE));
		System.out.print("For the yellow piece ");
		this.players.add(new Player(Piece.YELLOWPIECE));
		
		this.grid = new Grid();
		
		this.frameGame =new Frame();
	}
	
	/**
	 *  Give the players
	 * @return player list
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * Change the player turn
	 */
	public void changeTurn()
	{
		if (playerTurn == Piece.REDPIECE)
		{
			this.playerTurn = Piece.YELLOWPIECE;
			System.out.println("It's a Yellow piece's turn");
		}
		else
			{
			this.playerTurn = Piece.REDPIECE;
			System.out.println("It's a Red piece's turn");
			}
	}
	
	/**
	 * Play the game
	 * @return the winner color or emptysquare for draw 
	 * 
	 */
	public Piece play()
	
	{
		int turnCounter = 0;
		int line = 0;
		boolean inGrid = false;

		//System.out.println(this.grid);
		//Scanner columnChoice = new Scanner(System.in);
		boolean win = false;
		while(!win && turnCounter != 42)
		{
			this.changeTurn();
			//System.out.println(" choose the column : ");
			this.frameGame.waitClick();
			int columnChoice = this.frameGame.getColumnChoice();
			

			/**
			 * verify the colum choice, if it is in the grid
			 */
			do
			{
				try
				{
				if (columnChoice < 0 ||  columnChoice > 6)
					throw new IllegalGridPositionException();
				else
					inGrid = true;
				line = this.grid.stack(columnChoice,playerTurn);
				}
				catch(IllegalGridPositionException | FullColumnException e)
			{
					inGrid = false;
					
				//System.out.println(" Illegal column Choice, try again! ");
					this.frameGame.waitClick();
				columnChoice = this.frameGame.getColumnChoice();
			}
			}
			while ( inGrid == false);
			
			this.frameGame.changeColor(line, columnChoice, playerTurn);
			//System.out.println(this.grid);
			win = this.grid.search4Piece(line,columnChoice);
		}
		//columnChoice.close();
		
		if (win)
			return this.playerTurn;
		return Piece.EMPTYSQUARE;
			
		
	}

	public Grid getGrid() {
		return grid;
	}

}
