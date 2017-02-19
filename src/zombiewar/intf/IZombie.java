package zombiewar.intf;

/**
 * Zombie is a human who has been infected by the virus and is now a zombie.
 * A zombie stands still until a survivor disturb it.  It ten attacks the survivor.
 * 
 * @author thaoc
 */

public interface IZombie extends ICharacter{
	
	/**
	 * Attack a survivor
	 * 
	 * @param survivor 
	 */
	public void attack(ISurvivor survivor);
}
