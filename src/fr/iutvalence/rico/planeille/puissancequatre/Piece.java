package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * The three available pieces.
 *
 * @author ricos
 * @version 0.1
 */
public enum Piece {
    /** Empty square. */
    EMPTYSQUARE("V"),
    /** Red piece. */
    REDPIECE("R"),
    /** Yellow piece. */
    YELLOWPIECE("Y");

    /* TODO JAVADOC. */
    private final String display;

    /* TODO JAVADOC. */
    Piece(final String disp) {
        display = disp;
    }

    @Override
    public String toString() {
        return display;
    }
}
