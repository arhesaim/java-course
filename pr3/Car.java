package pr3;

public class Car {
    private boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return this.getClass().getName() + " -> startEngine()";
    }

    public String accelerate(){
        return this.getClass().getName() + " -> accelerator()";
    }

    public String brake(){
        return this.getClass().getName() + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
