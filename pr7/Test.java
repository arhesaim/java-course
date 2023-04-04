package pr7;

public class Test {
    public static void main(String[] args){
        Circle circle = new Circle(8);
        ComparableCircle comparableCircle = new ComparableCircle(6);
        System.out.println(comparableCircle.compareTo(circle));
    }
}
