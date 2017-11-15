public class Assassin extends Protagonist {

    public Assassin(String input) {
	super(input);
	health = 25;
	strength = 125;
	defense = 5;
	attackRating = 2;
    }
    
    public void specialize() {
	defense = 0;
	strength = 175;
    }

    public void normalize() {
	defense = 5;
	strength = 125;
    }
	
    public String about() {
	return "A being that lurks in the shadows waiting patiently for his opportunity. He is deadly but one good hit should do him in.";    
    }
}
