package fr.iutvalence.rico.planeille.puissancequatre;

/**
 * This class represents a player
 *
 * @author ricos
 */
public class Player {
    /**
     * Name of player
     */
    private final String name;
    
    /**
     * The color of square 
     */
    private final Square square;

    /**
     * Constructor of Player
     * @param n: the name of player
     * @param s: the color of piece of player
     */
    public Player(String n, Square s) {
        this.name = n;
        this.square = s;
    }
    /**
     * ToString redefined for player
     * @return a String which represents the player
     */
    public String ToString()
    {
    	return "Nom du joueur : "+name+"  couleur : "+square;
    }
    //TODO To check the name of 2 players. 
    //	public boolean equals(Joueur j)
    //	{
    //		if (j.nom ==this)
    //	}
}
