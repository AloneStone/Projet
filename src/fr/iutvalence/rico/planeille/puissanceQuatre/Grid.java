package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * This class represents the grid of game
 *
 * @author ricos
 * @version 0.1
 */
public class Grid {
    /**
     * This is 2 constants which represent the the number of column and line
     */
    private static final int NB_COLUMN = 7;
    private static final int NB_LINE   = 6;
    /**
     * This table of square represents the grid
     */
    private Square[][] grid;

    public Grid() {
        this.grid = new Square[NB_LINE][NB_COLUMN];
        for (int line = 0; line < NB_LINE; line++) {
            for (int column = 0; column < NB_COLUMN; column++) {
                grid[line][column] = Square.EMPTYSQUARE;
            }
        }
    }
}
