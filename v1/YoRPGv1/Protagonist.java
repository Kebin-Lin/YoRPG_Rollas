public class Protagonist{
    private String name;
    private int health, strength, defense;
    private double attackRating;
    public Protagonist(String n){
	name=n;
	health=100;
	strength=56;
	defense=30;
	attackRating=.4;
    }
    public boolean isAlive(){
	return !(health<=0);
    }
    public int getDefense(){
	return defense;
    }
    public String getName(){
	return name;
    }
    public void lowerHP(int damage){
	health-=damage;
    }
    public int attack(Monster m){
	int damage=(int) (strength*attackRating-m.getDefense());
        m.lowerHP(damage);
	return damage;
    }
    public void specialize(){
	defense/=2;
	attackRating*=2;
    }
    public void normalize(){
	defense=30;
	attackRating=.4;
    }
}
