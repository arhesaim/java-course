package pr7.asn7;

public class Line implements Mappable{
    String name;
    String[][] location;

    public Line(String name, String[][] location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void render() {
        System.out.print("\n render " + this.name + " as LINE ");
        System.out.print("[");
        for (String[] i: this.location){
            System.out.print("[");
            for (String k: i){
                System.out.print(k + " ");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
