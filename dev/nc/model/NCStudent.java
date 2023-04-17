package dev.nc.model;

public class NCStudent extends Student{
    private double percentComplete;
    public NCStudent() {
        percentComplete = random.nextDouble(0, 100.001);
    }
    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }
    public double getPercentComplete() {
        return percentComplete;
    }
}
