/*
Team Rollas
Kevin Lin, Shruthi, John
APCS pd8
HW30 -- Ye Olde Role Playing Game, Improved
2017-11-10
*/
public class Monster extends Character {

    public Monster() {
	health = 150;
	strength = (int) (Math.random()*45) + 20;
	defense = 20;
	attackRating = 1;
    }

}
