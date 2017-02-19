/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar.impl;
import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;
/**
 *
 * @author Jake
 */
public class Tank extends Character implements IZombie{

	private static int objCount = 0;
	private int id=0;
	
	/**
	 * A tank starts with 150 points of health
	 */
	public Tank() {
		super(150);
		id = objCount++;
	}

	/**
	 * An attack from the tank decrease a survivor's health by 20 points.
	 * @param survivor 
	 */
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(20);
	}
	
	public String toString() {
		return "Tank " + id;
	}
}
