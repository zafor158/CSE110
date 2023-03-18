Name:Md.Abu Zafor;
Student id: 2020-2-60-158;
class Food {
    private String name;
    private double servingSize;

    //creates a new food
    public Food (String name, double servingSize) {
        //implement this method
        this.name=name;
        if(servingSize>0){
        this.servingSize=servingSize;
        }
        else{
            System.out.println("Servicesize is not valid");
        }
    }

    // creates a new food
    public Food(String name) {
        this.name=name;

    }

    //gets the name of the food
    public String getName() {
        //implement this method
        return this.name;
    }

    //gets the serving size of the food
    public double getServingSize() {
        //implement this method
        return this.servingSize;
    }
}
public class Monster {
    public String name;
    public int numberoflegs;
    public int numberofeyes;
    public String flyornot;
    public int numberoftime;

    0.9
    public Monster(String name,int numberoflegs,int numberofeyes,String flyornot,int numbersoftime){
        this.name=name;
        this.numberoflegs=numberoflegs;
        this.numberofeyes= numberofeyes;
        this.flyornot=flyornot;
        this.numberoftime=numberoftime;
    }
    public Monster(String name){
        this.name=name;
    }
}
public class Zoo {
    private int capacity;
    private int numberOfMonsters;
    private Monster[] entriedMonsters;

    //creates a new zoo
    public Zoo(int capacity) {
        //implement this method
        this.capacity=capacity;
    }

    //adds an array of monsters to the zoo
    public void addAMonster(Monster[] monsters){
        //implement this method
        if(capacity>5) {
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < 5 - numberOfMonsters; k++) {
                    if (entiredmonsters[i] == null) {
                        entiredmonsters[i] = monster[k];
                    }
                }
            }
            numberOfMonsters++;
        }
    }

    //adds a monster to the zoo
    public void addAMonster(Monster monster){
        //implement this method
        if(capacity>5){
            for(int i=0;i<5;i++){
                if(entriedMonsters[i]==null){
                    entriedMonsters[i]=monster;
                }
            }
        }
    }

    //returns the number of monsters in zoo
    public int getNumberOfMonsters() {
        //implement this method
        return this.numberOfMonsters;
    }

    // returns the name of the monsters that have been fed x times in their lifetime
    public static String getMonsters(int numTimesFed){



    }

    // returns the name of the monsters whose favorite food is food
    public  String getMonsters(Food food){
        
    }

}
