package zombiewar.intf;

/**
 * Survivor is a human who hasn't been infected by the virus.
 * A survivor's goal is to make it to safety so that they can be rescued.
 * A survivor will attack a nearby zombie that is blocking his her way.
 * 
 * @author thaoc
 */
public interface ISurvivor extends ICharacter{
	
	/**
	 * Attack a zombie by decreasing its health.
	 * 
	 * @param zombie 
	 */
	public void attack(IZombie zombie);
}
