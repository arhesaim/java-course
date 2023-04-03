package pr6;

public interface Mappable {
    String JSON_PROPERTY = "properties: {%s}";
    String getLabel();
    Geometry getShape();
    String getMarker();
    String getName();
    String getType();

    default String toJSON(){
        return "label: " + getLabel() + ", marker: " + getMarker() + ", type: <" + getShape() + "> ";
    }

    static void maplt(Mappable mappable){
        System.out.printf(JSON_PROPERTY, mappable.toJSON() + ", " + mappable.getName() + ", " + mappable.getType());
    };
}
