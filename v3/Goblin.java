public class Goblin extends Monster {
    
    public Goblin() {
	health = 50;
	strength = (int) (Math.random()*20) + 50;
	defense = 20;
	attackRating = 1;
    }
}