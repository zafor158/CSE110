/* Put your name and student ID below:
Student ID:
Name:
*/
class Food {
    private String name;
    private double servingSize;

    //creates a new food
    public Food(String name, double servingSize) {
        //implement this method
    }

    // creates a new food
    public Food(String name) {

    }

    //gets the name of the food
    public String getName() {
        //implement this method
    }

    //gets the serving size of the food
    public double getServingSize() {
        //implement this method
    }
}

//implement this class
class Monster {

}

class Zoo {
    private int capacity;
    private int numberOfMonsters;
    private Monster[] entriedMonsters;

    //creates a new zoo
    public Zoo(int capacity) {
        //implement this method
    }

    //adds an array of monsters to the zoo
    public void addAMonster(Monster[] monsters){
        //implement this method
    }

    //adds a monster to the zoo
    public void addAMonster(Monster monster){
        //implement this method
    }

    //returns the number of monsters in zoo
    public int getNumberOfMonsters() {
        //implement this method
    }

    // returns the name of the monsters that have been fed x times in their lifetime
    public static String getMonsters(int numTimesFed){

    }

    // returns the name of the monsters whose favorite food is food
    public static String getMonsters(Food food){

    }
}

public class TestMonster {

    public static void main(String[] args) {

        Food cookies = new Food("cookie", 3.0);
        System.out.println(cookies.getName());
        System.out.println(cookies.getServingSize());

        Monster cookieMonster = new Monster("CookieMonster", 4, 2, false, cookies, 0);
        cookieMonster.looseALimb();
        cookieMonster.looseALimb();
        cookieMonster.looseAnEye();
        System.out.println(cookieMonster.getNumberOfLimbs());


        Food notCookies = new Food("broccoli", 1.0);
        Food meat[]=new Food[2];
        meat[0]=new Food("Chicken Meat", 1.0);
        meat[1]=new Food("Beef", 1.0);

        cookieMonster.eat(cookies);
        System.out.println(cookieMonster.getLifetimeFeed());

        cookieMonster.eat(meat);
        System.out.println(cookieMonster.getLifetimeFeed());

        cookieMonster.eat(cookies);
        System.out.println(cookieMonster.getLifetimeFeed());


        cookieMonster.eat(notCookies);
        System.out.println(cookieMonster.getLifetimeFeed());


        System.out.println(cookieMonster);

    }

}

public class TestZoo {
    public static void main(String[] args) {
        Zoo theZoo = new Zoo(5);// 5 refers to the capacity

        // add some monsters
        Monster monsters[] = new Monster[4];
        monsters[0] = new Monster("m1", 4, 2, true, new Food("cookies"), 5);
        monsters[1] = new Monster("m2", 7, 1, false, new Food("spinach"), 0);
        monsters[2] = new Monster("m3");
        monsters[3] = new Monster("m4", 0, 6, false, new Food("humans"), 1);
        Monster m4 = new Monster("m5");

        theZoo.addAMonster(monsters);
        theZoo.addAMonster(m4);
        System.out.println(theZoo.getNumberOfMonsters() + " monsters");


        //add another monster
        Food cookies = new Food("Cookies", 3.0);
        Monster badMonster = new Monster("Bad Monster", 4, 2, false, cookies,0);

        theZoo.addAMonster(badMonster);
        System.out.println(theZoo.getNumberOfMonsters() + " monsters");

        System.out.println(Zoo.getMonsters(new Food("humans")));
        System.out.println(Zoo.getMonsters(0));
    }

}
