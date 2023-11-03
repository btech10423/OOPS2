//CLASSES AND OBJECTS
/*public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(50);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}

class student {
    String name;
    int age;
    float percentage;

    void calculatepercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}*/

//GETTERS AND SETTERS
/*public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}*/

//CONSTRUCTORS
/*public class OOPS {
    public static void main(String args[]) {
        //Student s1 = new Student("Vaibhav");
        //System.out.println(s1.name);
        Student s1 = new Student();
    }
}

class Student {
    String name;
    int roll;

    //Student(String name) {
        //this.name = name;
    //}
    Student() {
        System.out.println("constructor is called..");
    }
}*/

//TYPES OF CONSTRUCTORS
/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Vaibhav");
        Student s3 = new Student(123);
       
    }
}
class Student {
    String name;
    int roll;
   //nonparamaterized
    Student() {
        System.out.println("constructor is called...");
    }
    //paramaterized
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}*/

//(COPY CONSTRUCTOR)
/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Vaibhav";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "abc";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor

    // Student(Student s1){
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}*/

//INHERITANCE
//(SINGLE LEVEL INHERITANCE)
/*public class OOPS {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}*/

//(MULTI LEVEL INHERITANCE)
/*public class OOPS {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived classes
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}*/

//(HIERARCHIAL INHERITANCE)
/*public class OOPS {
    public static void main(String[] args) {

        System.out.println();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}*/

//(HYBRID INHERITANCE)
/*public class OOPS {
    public static void main(String[] args) {
        
        System.out.println();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
class Dog extends Mammal {
    String breed;
} 
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}*/

//METHOD OVERLOADING
/*public class OOPS {
    public static void main(String args[]) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float) 2.5));
        System.out.println(calc.sum(1, 2, 3));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}*/

//METHOD OVERRIDING
/*public class OOPS {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {

    void eat() {
        System.out.println("eats grass");
    }
}*/

//ABSTRACT CLASSES
/*public class OOPS {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        Mustang myHorse = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "brown";
        System.out.println("animal constructor called");
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }

    void changecolor() {
        color = "darkbrown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal {
    void changecolor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}*/

//INTERFACES
/*public class OOPS {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer {
    void moves();
}

class Queen implements Chessplayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all 4 drirections)");
    }
}

class Rook implements Chessplayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class king implements Chessplayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}*/

//STATIC KEYWORD
/*public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}*/

