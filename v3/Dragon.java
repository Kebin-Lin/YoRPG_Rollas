public class Dragon extends Monster {
    
    public Dragon() {
	health = 170;
	strength = (int) (Math.random()*20) + 50;
	defense = 15;
	attackRating = .8;
    }
	
    public static String about() {
		return "Hard scales (some wild health!) n a hard head";
    }
}