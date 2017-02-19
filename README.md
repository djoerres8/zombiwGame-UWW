#Zombie War


A virus has infected people and turned them into zombies.  There are a few
survivors that must make it to a safe place without getting killed by the
zombies. 

There are different types of zombies:  Common Infected and Tank.  A common
infected zombie is weak and does little damage. Tank on the other can do a lot
of damage and can take a lot of attack before it dies.  

The types of survivors include:  soldier, teacher, and child.  A soldier is
strong and can do serious damage while a teacher or a child does little damage.
Since a child is so weak, he or she usually does not survive the escape.  

#Character data:
```
                Health      Attack
Common Infect   30          5
Tank           150         20
Child           20          2
Teacher         50          5
Soldier        100         10
```

A character has an initial health.  It lose health in each attack.  The amount
of health lost depends on who is doing the attack.  For example, if a tank
attacks a survivor, one attack would cause the survivor to lose 20 health
points.

#Tasks:

1. Write the zombie character classes (common infected, tank)
2. Write the survivor character classes (child, teacher, soldier)
3. Write the program as described below

#Program logic


The program randomly generates an array of survivors and zombies.  Make each
survivor attack every zombie.  Next, make each zombie attack every survivor.
Repeat until all zombie or all survivors are dead.  Then print a report of how
many survivors made it to safety.  A dead survivor or a dead zombie should not
attack.  

#Release 1.0's sample run:

```
We have 17 survivors trying to make it to safety.
But there are 8 zombies waiting for them.
It seems 6 have made it to safety.
```

#Release 2.0's sample run:

```
We have 5 survivors trying to make it to safety (0 children, 3 teachers, 2 soldiers)
But there are 9 zombies waiting for them (2 common infected, 7 tanks)
 	Soldier 1 killed CommonInfected 0
	Soldier 1 killed CommonInfected 1
	Tank 2 killed Teacher 0
	Tank 2 killed Teacher 1
	Tank 2 killed Teacher 2
	Tank 4 killed Soldier 0
	Tank 4 killed Soldier 1
None of the survivors made it.
```
