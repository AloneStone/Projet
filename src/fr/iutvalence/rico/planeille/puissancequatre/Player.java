package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * Player: name and piece.
 *
 * @author ricos
 * @version TODO
 */
public class Player {
    /** Player's name. */
    private final String name;
    /** Piece's color. */
    private final Piece  m_piece;

    /**
     * Constructor of Player.
     *
     * @param n the name of player
     * @param s the color of piece of player
     */
    public Player(String n, Piece s) {
        this.name = n;
        this.m_piece = s;
    }

    /* TODO Translate. */
    @Override
    public String toString() {
        return "Nom du joueur : " + name + "  couleur : " + m_piece;
    }
}
