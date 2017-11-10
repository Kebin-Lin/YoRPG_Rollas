public class Character {
    //instance vars
    public int health;
    public int strength;
    public int defense;
    public double attackRating;

    public boolean isAlive() {return (health > 0);}

    public int getDefense() {return defense;}

    public void lowerHP(int dmg) {health -= dmg;}

    public int attack(Monster target) {
	int dmg = (int) (strength * attackRating) - target.getDefense();
	target.lowerHP(dmg);
	return dmg;
    }

    public int attack(Protagonist target) {
	int dmg = (int) (strength * attackRating) - target.getDefense();
	target.lowerHP(dmg);
	return dmg;
    }
}
