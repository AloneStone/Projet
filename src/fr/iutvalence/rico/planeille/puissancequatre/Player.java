	package fr.iutvalence.rico.planeille.puissancequatre;

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
    public Player(String n, Piece s) {
        this.name = n;
        this.piece = s;
    }
    @Override
    public String toString() {
        return "Name of Gamer : " + name + "  couleur : " + piece;
    }
}
