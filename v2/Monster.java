/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW28 -- Ye Olde Role Playing Game
2017-11-08
*/
public class Monster extends Character {

    public Monster() {
	health = 150;
	strength = (int) (Math.random()*45) + 20;
	defense = 20;
	attackRating = 1;
    }

}
