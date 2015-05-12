package fr.iutvalence.rico.planeille.puissancequatre;
import java.util.ArrayList;
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
	
	
	public Game()
	{
		this.playerTurn = Piece.REDPIECE;
		this.players = new ArrayList<Player>();
		this.players.add(new Player("J1",Piece.REDPIECE));
		this.players.add(new Player("J2",Piece.YELLOWPIECE));
		this.grid = new Grid();
	}
	
	/**
	 * 
	 */
	public void changeTurn()
	{
		if (playerTurn == Piece.REDPIECE)
			this.playerTurn = Piece.YELLOWPIECE;
		else
			this.playerTurn = Piece.REDPIECE;
	}
	
	/**
	 * 
	 * @return
	 */
	public Piece play()
	{
		int turnCounter = 0;
		int line;
		Scanner columnChoice = new Scanner(System.in);
		boolean win = false;
		this.grid.toString();
		while(!win && turnCounter != 42)
		{
			System.out.println("Choose the column : ");
			int column = columnChoice.nextInt();
			
			if (turnCounter %2 == 0)
				line = Stack(column, Piece.REDPIECE);
			else
				line = Stack(column, Piece.YELLOWPIECE);
			
			search4Piece(line, column);
			
			
			
			this.grid.toString();
			
		}
	}

}
