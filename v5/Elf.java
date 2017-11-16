public class Elf extends Protagonist {

    public Elf(String input) {
	super(input);
	health = 100;
	strength = 70;
	defense = 180;
	attackRating = 1;
    }

    public void specialize() {
	defense = 10;
	strength = 120;
    }

    public void normalize() {
	defense = 180;
	strength = 70;
    }

    public String about() {
	return "Stealthy majestic folk with sharp ears and a sharp bow. (Almost) nothing hurts them";
    }

    public void passive() { //Critical Hit

    }
}
