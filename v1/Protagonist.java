/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/
public class Protagonist {
    //instance vars
    private String name;
    private int health;
    private int strength;
    private int defense;
    private double attackRating;
    //constructor
    public Protagonist(String input) {
	name = input;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    public boolean isAlive() {return (health > 0);}

    public int getDefense() {return defense;}

    public String getName() {return name;}

    public void lowerHP(int dmg) {health -= dmg;}

    public int attack(Monster target) {
	int dmg = (int) (strength * attackRating) - target.getDefense();
	target.lowerHP(dmg);
	return dmg;
    }

    public void specialize() {
	defense = 35;
	strength = 150;
    }

    public void normalize() {
	defense = 40;
	strength = 100;
    }
}
