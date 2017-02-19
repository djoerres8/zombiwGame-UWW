package zombiewar.intf;

/**
 * The ICharacter represents possible characters in the game.  
 * A character has certain amount of health.  The amount of health depends
 * on the specific character.  When its health reaches 0, it is dead.
 * A character health is decreased by an enemy in an attack.
 * 
 * @author thaoc
 */


public interface ICharacter {
	
	/**
	 * decrease in health as a result of being attacked.
	 * 
	 * @param increment the amount of health to decrease.
	 */
	public void decreaseHealth(int increment);
	
	/**
	 * Is the character still alive?
	 * @return true if still alive.
	 */
	public boolean isAlive();
}
