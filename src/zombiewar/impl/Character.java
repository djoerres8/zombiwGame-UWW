package zombiewar.impl;

import zombiewar.intf.ICharacter;

public abstract class Character implements ICharacter{
	
	public int health;
	
	Character(int health){
		this.health = health;
	}

	@Override
	public void decreaseHealth(int increment) {
		health-=increment;
	}

	@Override
	public boolean isAlive() {
		return (health > 0);
	}
	
	
}
