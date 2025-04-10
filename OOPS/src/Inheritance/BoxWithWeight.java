package Inheritance;

/** Note:
 *  This class Inherits the properties of Box Class which is parent and so This class is called Child Class
 *  To Inherit the properties of parent class use "extends" keyword */
public class BoxWithWeight extends Box {
    double weight;

    //NOTE: We can only create those Constructors involving Parent which are actually present in Parent
    //      Child we can create how much ever we want with above parent if needed
    //Example: Parent class Box has 4 constructors empty,all, existingBox, length super

    //Constructor 0: Default Constructor with just weight i.e only child properties and not parent properties
    public BoxWithWeight(double weight){
        super();    // We can skip as well if we wont be passing any parent properties during object creation
        this.weight = weight;
    }

    //Constructor 1: With all 3 Parent and 1 child Parameter
    public BoxWithWeight(double height, double width, double length, double weight){
        // To inherit the constructor from Parent class to setValue we use the "super" Keyword.
        super(height,width,length); // Here Clicking ctrl + super will redirect to its parent ie Box class
        // Note: super class has to be the first line inside the constructor
        this.weight = weight;
    }

    // Constructor 1A: With all three parent (No child we need to pass)
    public BoxWithWeight(double width,double height, double length){
        super(width,height,length);
    }

    //constructor 3: With just one parent (Also we added one child)
    public BoxWithWeight(double length, double weight){
        super(length);
        this.weight = weight;
    }

    public BoxWithWeight() {}

    @Override
    public String toString() {
        return "BoxWithWeight{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
