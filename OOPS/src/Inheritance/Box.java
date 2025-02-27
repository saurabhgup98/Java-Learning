package Inheritance;

public class Box {
    double width;
    double height;
    double length;

    public Box() {
        super(); // This does not gives error though we are not inheriting anything here from its parent
        // This happens because => :: "Each Class extends the default  Object class"
        // Click "ctrl+ click on super" => It will redirect to "Object" class
        this.width = 1;
        this.height = 1;
        this.length = 1;
    }

    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double length){
        this.width = length;
        this.height = length;
        this.length = length;
    }

    public Box (Box old){
        this.width = old.width;
        this.height = old.height;
        this.length = old.length;
    }
}