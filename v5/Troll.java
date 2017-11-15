public class Troll extends Monster {
    
    public Troll() {
	health = 125;
	strength = (int) (Math.random()*20) + 50;
	defense = 40;
	attackRating = 1;
    }
	
    public static String about() {
	return "When you meet this monster of the mountains, know that his superior defense will make him quite tough to kill.";
    }
}
