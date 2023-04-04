package pr7;

import java.lang.Comparable;
public class ComparableCircle extends Circle implements Comparable<Circle>{

    public ComparableCircle(double radius) {
        super(radius);
    }
    @Override
    public int compareTo(Circle o){
        if (o.getArea() > super.getArea()){
            return -1;
        } else if (this.getArea() > o.getArea()){
            return 1;
        } else {
            return 0;
        }
    }
}
