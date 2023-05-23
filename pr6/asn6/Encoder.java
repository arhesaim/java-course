package pr6.asn6;

import java.util.HashMap;

abstract class Encoder {
    HashMap<String, String> dict;

    public Encoder(HashMap<String, String> dict){
        this.dict = dict;
    }


}
