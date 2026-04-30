package games;
 
public interface Game {
    
	/**
	 * Starts the game. 
	 */
	
	void run(String gameName);
	
	/**
	 * Returns the name of the game
	 * 
	 */
	 String getName();
}
