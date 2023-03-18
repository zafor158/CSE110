
public class Person{
    public String name;
    private int age;
    private double height;
    private double weight;

    public Person(){
        this.name = null;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.height = 0;
        this.weight = 0;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return this.name + " " + this.age + " " + this.height + " " + this.weight;
    }

    public void becomeOlder(){
        this.age = this.age + 1;
    }

    public boolean isAdult(Person p){
        // Current Object: The object that is invoking this method
        // Arg object: p
        if (this.age > p.age){
            return true;
        }
        else {
            return false;
        }
    }
}





// 1. Instance Variable
// 2. Method:
// a) Constructor: Special Method
// Constructor: Definition
// [public][class-name](Arguments / No arguments){
//
// }

// Objective of Constructor:
// 1. initialize Instance Variables
// 2. When you are creating an object of a class that is
// you are allocating memory for a reference variable you are actually calling the
// constructor
// 3. If your class does not have a single constructor only then Java
// by default creates a no-arg constructor
// 4. A class can have multiple constructors



// b. Getter Method and Setter Method
// Getter Method: Return current value of an instance variable
// Getter Method Definition:
// [public] [data-type] [method-name:] getName(){
//
// }

// Setter Method: Set the value of an instance variable to argument variable
// [public] [void] [method-name] setName(data-type){
//}

// toString Method: instance variable: value --> summary return
// [public] [String] [toString](){
//
// }
// To call a toString Method: sout(object-name)


// Normal Method: Definition
// [Access Modifier][data-type][method-name](Arguments){
//
// }

/*
public class Person {
    private String name; // default: null
    private int age; // default: 0


    // No-arg Constructor
    public Person(){
        this.name = "John";
        this.age = 1;
    }

    // Constructor with 2 arguments
    public Person(String name, int age){
        // instance variable = argument variable
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return this.name + ", " + this.age;
    }

    public static void main(String[] args) {
        //Person p1; //p1 is a reference of class Person
        //p1 = new Person(); // memory allocate: p1 is an object of class Person

        //Person p1 = new Person();
        //System.out.println(p1.name + p1.age);
        //System.out.println(p1.getName());
        //System.out.println(p1.getAge());

        Person p2 = new Person("Karim", 50);
        System.out.println(p2);
        //System.out.println(p2.getName() + " " + p2.getAge());
        p2.setAge(52);
        //System.out.println(p2.getName() + " " + p2.getAge());
        System.out.println(p2);

        /*p1.name = "John";
        p1.age = 32;
        System.out.println(p1.name + p1.age);

        p2.name = "Ruby";
        p2.age = 5;
        System.out.println(p2.name + p2.age);*/
    //}
//}
