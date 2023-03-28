package pr6;

public interface Mappable {
    String JSON_PROPERTY = "properties: ";
    String getLabel();
    String getMarker();
    Geometry getShape();

    default void toJSON(){
        getLabel();
        getMarker();
        getShape();
    }

    static void maplt(Mappable mappable){
        mappable.toJSON();
    };
}
