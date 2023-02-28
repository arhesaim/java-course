package pr2;

public class Calculator {
    private Floor floor;
    private Carpet carper;

    public Calculator(Floor floor, Carpet carper) {
        this.floor = floor;
        this.carper = carper;
    }

    public double getTotalCost(){
        return floor.getArea()* carper.getCost();
    }
}
