public class Goblin extends Monster {
    
    public Goblin() {
	health = 50;
	strength = (int) (Math.random()*20) + 50;
	defense = 20;
	attackRating = 1;
    }
	
    public static String about() {
	return "A small creature, doesn't look like it has much HP.";
    }
}
