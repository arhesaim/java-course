package pr7.asn7;

public class Point implements Mappable{

    String name;
    String[] location;

    public Point(String name, String[] location){
        this.name = name;
        this.location = location;
    }
    @Override
    public void render() {
        System.out.print("\n render " + this.name + " as POINT ");
        System.out.print("[");
        for (String i: this.location){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
