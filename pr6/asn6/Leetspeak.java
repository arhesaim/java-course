package pr6.asn6;

import java.util.ArrayList;
import java.util.HashMap;

public class Leetspeak extends Encoder{

    public Leetspeak(HashMap<String, String> dict){
        super(dict);
    }
    public String encode(String line){

        if (line.isEmpty()){
            return null;
        } else {
            char[] charArray = line.toCharArray();
            ArrayList<String> leetLine = new ArrayList<>();

            for (char i: charArray){
                if (this.dict.containsKey(String.valueOf(i).toLowerCase())){
                    leetLine.add(this.dict.get(String.valueOf(i).toLowerCase()));
                }
                else {
                    leetLine.add(String.valueOf(i));
                }
            }
            String strLine = String.join("", leetLine);
            return strLine;
        }
    }
}
