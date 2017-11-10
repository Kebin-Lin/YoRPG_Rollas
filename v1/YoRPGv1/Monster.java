public class Monster{
    private int health, strength, defense;
    private double attackRating;
    public Monster(){
	health=150;
	strength=(int) (Math.random()*45) +20;
	defense=20;
	attackRating=1;
    }
    public boolean isAlive(){
	return !(health<=0);
    }
    public int getDefense(){
	return defense;
    }
    public void lowerHP(int damage){
	health-=damage;
    }
    public int attack(Protagonist p){
	int damage=(int) (strength*attackRating-p.getDefense());
        p.lowerHP(damage);
	return damage;
    }
}
