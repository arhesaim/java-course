package pr7.asn7;

import java.util.ArrayList;

public class Layer<T extends Mappable> {
    private ArrayList<T> layerElements = new ArrayList<>();

    public void addElement(T element){
        this.layerElements.add(element);
    }

    public void renderLayer(){
        for (T el: this.layerElements){
            el.render();
        }
    }


}
