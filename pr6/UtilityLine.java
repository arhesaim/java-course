package pr6;

public class UtilityLine implements Mappable{
    private String name;
    private UtilityType utilityType;
    private Geometry type;
    private Color color;
    private LineMarkers lineMarkers;

    public UtilityLine(String name, UtilityType utilityType, Geometry type, Color color, LineMarkers lineMarkers) {
        this.name = name;
        this.utilityType = utilityType;
        this.type = type;
        this.color = color;
        this.lineMarkers = lineMarkers;
    }

    @Override
    public String getLabel() {
        return "<" + this.name + "(" + this.utilityType + ")> ";
    }

    @Override
    public String getMarker() {
        return "<" + this.color + " " + this.lineMarkers + "> ";
    }

    @Override
    public Geometry getShape() {
        return this.type;
    }

    public String getName(){
        return " name: " + this.name;
    }
    @Override
    public String getType(){
        return " utility: " + this.utilityType;
    }
}
