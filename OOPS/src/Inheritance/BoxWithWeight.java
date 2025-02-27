package Inheritance;

/** Note:
 *  This class Inherits the properties of Box Class which is parent and so This class is called Child Class
 *  To Inherit the properties of parent class use "extends" keyword */
public class BoxWithWeight extends Box {
    double weight;

    public BoxWithWeight(double height, double width, double length, double weight){
        // To inherit the constructor from Parent class to setValue we use the "super" Keyword.
        super(height,width,length); // Here Clicking ctrl + super will redirect to its parent ie Box class
        // Note: super class has to be the first line inside the constructor
        this.weight = weight;
    }
}
