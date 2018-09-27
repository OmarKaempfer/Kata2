package histogram;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 5, -10, 20, 74, -2, 2, 0, 5, -4, 5, -7, 1};
        Histogram histogram = new Histogram(data);
        Map<Integer, Integer> histogramMap = histogram.getHistogram();
        for(int key : histogramMap.keySet()) {
            System.out.println(key + " : " + histogramMap.get(key));
        }
    }
}
