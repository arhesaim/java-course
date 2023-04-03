package pr6;

public class Main {
    public static void main(String[] args){
        Building building = new Building("Narva Town Hall", UsageType.GOVERNMENT, Geometry.POINT, Color.RED, PointMarkers.STAR);
        //building.toJSON();

        UtilityLine utilityLine = new UtilityLine("Raekoja Plats", UtilityType.FIBER_OPTIC, Geometry.LINE, Color.GREEN, LineMarkers.DOTTED);
        //utilityLine.toJSON();

        Mappable.maplt(building);
        System.out.println("");
        Mappable.maplt(utilityLine);
    }
}
