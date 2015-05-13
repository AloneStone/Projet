	package fr.iutvalence.rico.planeille.puissancequatre;

import java.util.Scanner;

/**
 * Player: name and piece.
 *
 * @author ricos
 * @version 1.0.0
 */
public class Player {
    /** Player's name. */
    private final String name;
    
	/** Piece's color. */
    private final Piece  piece;

    /**
     * Constructor of Player.
     *
     * @param n the name of player
     * @param s the color of piece of player
     */
    public Player( Piece s) {
    	
    	Scanner scan = new Scanner(System.in);
		System.out.println("Choose a name for player : ");
		String namePlayer = scan.nextLine();
        this.name = namePlayer;
        this.piece = s;
        //scan.close();
    }
    /**
     * 
     * @return piece
     */
    public Piece getPiece() {
		return piece;
	}
     
    /**
     * 
     */
	@Override
    public String toString() {
		String nameOfColor ="Yellow";
		if (this.getPiece().equals(Piece.REDPIECE))
			nameOfColor = "Red";
        return "Name of Gamer : " + name + "  color : " + nameOfColor; 
    }
	
}
