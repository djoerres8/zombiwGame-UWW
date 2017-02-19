package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

/**
 * Common infects are the weakest zombies.  
 * 
 * @author thaoc
 */
public class CommonInfected extends Character implements IZombie{

	private static int objCount = 0;
	private int id=0;
	
	public CommonInfected() {
		super(30);
		id = objCount++;
	}

	@Override
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(5);
	}
	
	public String toString(){
		return "CommonInfected " + id;
	}
	
}