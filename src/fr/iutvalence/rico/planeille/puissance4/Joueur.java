package fr.iutvalence.rico.planeille.puissance4;

/**
 * TODO JAVADOC.
 *
 * @author ricos
 * @version TODO
 */
public class Joueur {
    /* TODO JAVADOC. */
    private final String nom;
    /* TODO JAVADOC. */
    private final Pion   pion;

    /* TODO JAVADOC. */
    public Joueur() {
        this("J1");
        /* TODO Initialiser le pion. */
    }

    /* TODO JAVADOC. */
    public Joueur(String n) {
        this.nom = n;
        /* TODO Initialiser le pion. */
    }

    //TODO red�finir les m�thodes du type object. Anthony : POURQUOI ?
    //	public boolean equals(Joueur j)
    //	{
    //		if (j.nom ==this)
    //	}
}
