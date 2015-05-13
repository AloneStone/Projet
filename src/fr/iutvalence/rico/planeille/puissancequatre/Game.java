package fr.iutvalence.rico.planeille.puissancequatre;
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
	
	private Piece playerTurn;
	private ArrayList<Player> players;
	private Grid grid ;
	
	/**
	 * Contructor of game
	 */
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
		
		//TODO Scanner
		this.players.add(new Player("J1",Piece.REDPIECE));
		this.players.add(new Player("J2",Piece.YELLOWPIECE));
		this.grid = new Grid();
	}
	
	/**
	 * 
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
			this.playerTurn = Piece.YELLOWPIECE;
		else
			this.playerTurn = Piece.REDPIECE;
	}
	
	/**
	 * Play the game
	 * @return the winner color or emptysquare for draw 
	 */
	public Piece play()
	{
		int turnCounter = 0;
		int line;
		System.out.println(this.grid);
		Scanner columnChoice = new Scanner(System.in);
		boolean win = false;
		while(!win && turnCounter != 42)
		{
			changeTurn();
			System.out.println("Choose the column : ");
			int column = columnChoice.nextInt();

			line = this.grid.stack(column-1,playerTurn);	
			System.out.println(this.grid);
			win = this.grid.search4Piece(line,column-1);
		}
		columnChoice.close();
		
		if (win)
			return this.playerTurn;
		return Piece.EMPTYSQUARE;
			
		
	}

}
