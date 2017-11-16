/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW30 -- Ye Olde Role Playing Game, Improved
2017-11-10
*/
public class Character {
    //instance vars, protected allows for subclasses to use them
    protected int health;
    protected int strength;
    protected int defense;
    protected double attackRating;

    public boolean isAlive() {return (health > 0);}

    public int getDefense() {return defense;}

    public void lowerHP(int dmg) {health -= dmg;}

    public int attack(Character target) {
	int dmg = (int) (strength * attackRating) - target.getDefense();
	if (dmg < 0) {dmg = 0;}
	target.lowerHP(dmg);
	return dmg;
    }
	
	//only for Elfs
	public int passive(Character target) {
	int dmg = (int) (strength * attackRating*2) - target.getDefense();
	if (dmg < 0) {dmg = 0;}
	target.lowerHP(dmg);
	return dmg;
    }
}
