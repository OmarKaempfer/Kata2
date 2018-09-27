package histogram;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 5, -10, 20, 74, -2, 2, 0, 5, -4, 5, -7, 1};
        Map<Integer, Integer> histogram = getHistogramMap(data);
        for(int key : histogram.keySet()) {
            System.out.println(key + " : " + histogram.get(key));
        }
    }

    public static Map<Integer, Integer> getHistogramMap(int[] data) {
        Map<Integer, Integer> histogram = new HashMap<>();
        for(int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram;
    }
}
