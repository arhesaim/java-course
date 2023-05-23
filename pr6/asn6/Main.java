package pr6.asn6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        dict.put("a", "4");
        dict.put("e", "3");
        dict.put("l", "1");
        dict.put("m", "/^^\\");
        dict.put("o", "0");
        dict.put("u", "(_)");

        Leetspeak leetspeak = new Leetspeak(dict);
        String line = "cAmEl";

        System.out.println(leetspeak.encode(line));
    }
}
