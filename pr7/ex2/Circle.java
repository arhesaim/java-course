package pr7.ex2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI*this.radius)*2;
    }
}
