package pr6;

public class Building implements Mappable{
    private String name;
    private UsageType buildingType;
    private Geometry type;
    private Color color;
    private PointMarkers pointMarkers;

    public Building(String name, UsageType buildingType, Geometry type, Color color, PointMarkers pointMarkers) {
        this.name = name;
        this.buildingType = buildingType;
        this.type = type;
        this.color = color;
        this.pointMarkers = pointMarkers;
    }

    @Override
    public String getLabel() {
        return "<" + this.name + "(" + this.buildingType + ")> ";
    }

    @Override
    public String getMarker() {
        return "<" + this.color + " " + this.pointMarkers + "> ";
    }

    @Override
    public Geometry getShape() {
        return this.type;
    }
    @Override
    public String getName(){
        return " name: " + this.name;
    }
    @Override
    public String getType(){
        return " usage: " + this.buildingType;
    }
}
