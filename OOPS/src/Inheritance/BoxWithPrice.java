package Inheritance;

public class BoxWithPrice extends BoxWithWeight{
    int price;

    public BoxWithPrice(int price) {
        super();
        this.price = price;
    }

    public BoxWithPrice(double weight) {
        super(weight);
    }

    public BoxWithPrice(double height, double width, double length, double weight) {
        super(height, width, length, weight);
    }

    public BoxWithPrice(double height, double width, double length, double weight,int price){
        super(height, width, length, weight);
        this.price = price;
    }

    public BoxWithPrice(double width, double height, double length) {
        super(width, height, length);
    }

    public BoxWithPrice(double length, double weight) {
        super(length, weight);
    }
}
