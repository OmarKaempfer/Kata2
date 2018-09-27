package histogram;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        String[] data = new String[] {"Rosa", "Pepe","María","Pepe", "Pepe", "Rosa"};
        Histogram histogram = new Histogram(data);
        Map<String, Integer> histogramMap = histogram.getHistogram();
        for(String key : histogramMap.keySet()) {
            System.out.println(key + " : " + histogramMap.get(key));
        }
    }
}
