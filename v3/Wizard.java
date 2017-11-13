public class Wizard extends Protagonist {

    public Wizard(String input) {
	super(input);
	health = 100;
	strength = 20;
	defense = 20;
	attackRating = 1;
    }
    
    public void specialize() {
	defense = 10;
	strength = 100;
    }

    public void normalize() {
	defense = 20;
	strength = 20;
    }
}