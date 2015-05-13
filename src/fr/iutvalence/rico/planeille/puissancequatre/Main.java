package fr.iutvalence.rico.planeille.puissancequatre;

public class Main {

	public static void main(String[] args) {
		
		Game game = new Game();
		Piece winner = game.play();
		if(winner.equals(Piece.EMPTYSQUARE))
			System.out.println("Nobody won");
		else 
		{
			System.out.println("12345");
			
		}
		

	}

}
