package pr2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        if (length < 0){
            this.length = 0;
        } else {
            this.length = length;
        }
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getArea(){
        return this.length*this.width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
