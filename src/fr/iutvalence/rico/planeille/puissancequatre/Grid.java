package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * Grid of the game.
 *
 * @author ricos
 * @version 0.1
 */
public class Grid {
    /* TODO JAVADOC. */
    private static final int NB_COLUMN = 7;
    /* TODO JAVADOC. */
    private static final int NB_LINE = 6;
    /* TODO JAVADOC. */
    private Piece[][] grid;

    /* TODO JAVADOC. */
    public Grid() {
        this.grid = new Piece[NB_LINE][NB_COLUMN];
        for (int line = 0; line < NB_LINE; line++) {
            for (int column = 0; column < NB_COLUMN; column++) {
                grid[line][column] = Piece.EMPTYSQUARE;
            }
        }
    }
}
