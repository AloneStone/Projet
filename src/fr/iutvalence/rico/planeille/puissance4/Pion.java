package fr.iutvalence.rico.planeille.puissance4;

/**
 * @author ricos
 *
 */
public class Pion extends Case{

	public static final String ROUGE = "R";
	public static final String JAUNE = "J";
	
	private final String couleur;
	
	public Pion(String c)
	{
		this.couleur = c;
	}
}
