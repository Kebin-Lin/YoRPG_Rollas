/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/
public class Monster {
    //instance vars
    private String name = "Monster";
    private int health;
    private int strength;
    private int defense;
    private double attackRating;

    public Monster() {
	health = 150;
	strength = (int) (Math.random()*45) + 20;
	defense = 20;
	attackRating = 1;
    }

    public boolean isAlive() {return (health > 0);}

    public int getDefense() {return defense;}

    public String getName() {return name;}

    public void lowerHP(int dmg) {health -= dmg;}

    public int attack(Protagonist target) {
	int dmg = (int) (strength * attackRating) - target.getDefense();
	target.lowerHP(dmg);
	return dmg;
    }
}