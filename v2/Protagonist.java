/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW30 -- Ye Olde Role Playing Game, Improved
2017-11-10
*/
public class Protagonist extends Character {
    //instance vars
    private String name;
    //constructor
    public Protagonist(String input) {
	name = input;
	health = 125;
	strength = 100;
	defense = 40;
	attackRating = 0.4;
    }

    public String getName() {return name;}

    public void specialize() {
	defense = 35;
	strength = 150;
    }

    public void normalize() {
	defense = 40;
	strength = 100;
    }
}
