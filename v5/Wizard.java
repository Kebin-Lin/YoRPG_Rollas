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

    public String about() {
	return "A person who has spent their life studying magic. Their body may be weak, but their mind is strong.";
    }

    public void passive() { //Life Steal
      int healing = (int) (strength * attackRating * .2);
      System.out.println("\nLife Steal has healed for " + healing + " HP!");
      health += healing;
    }
}
