package polymorphism;

public class PolyMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Shapes shapes = new Shapes();

        System.out.println("The area of shapes is :: shapes .area" );
        shapes.area();

        System.out.println("The area of circle is :: circle.area" );
        circle.area();

        System.out.println("The area of square is :: square.area" );
        square.area();

        System.out.println("The area of triangle is :: triangle.area" );
        triangle.area();

        Shapes squareOne = new Square();
        System.out.println("The area of squareOne referenced by Shape class is ::");
        squareOne.area();
        // This is Called Upcasting: Core feature of Java Polymorphism
        // This means "Because square "is-a" Shape i.e. Square contain all the properties of Shape
//        System.out.println(squareOne.side);

    }
}
