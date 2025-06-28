package polymorphism;

public class Square extends Shapes{
    int side;
    void area(){
        System.out.println("Area of Square");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
