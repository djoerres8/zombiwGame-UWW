
package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

/**
 * This class represents a Teacher in the game.  A teacher has 50 health and
 * does about 5 health point damage to a zombie. 
 * 
 * @author thaoc
 */
public class Teacher extends Character implements ISurvivor{

	private static int objCount = 0;
	private int id=0;
	
	/**
	 * Teacher starts with 50 health points
	 */
	public Teacher() {
		super(50);
		id = objCount++;
	}


	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(5);
	}
	
	public String toString(){
		return "Teacher " + id;
	}
	
}
