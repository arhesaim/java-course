package pr5;

public class Place {
    private String place;
    private double distance;

    public Place(String place, double distance) {
        this.place = place;
        this.distance = distance;
    }

    public Place (String place){
        this.place = place;
        this.distance = 0.0;
    }

    public String getPlace() {
        return place;
    }

    public double getDistance() {
        return distance;
    }
}
