
import java.util.HashMap;

public class tow_sum {
    public static void main(String[] args) {
        System.out.println("welcome leetcode two sum problem");

        int[] arr = { 2, 4, 43, 23, 66 };

        HashMap<Integer, Integer> map = new HashMap<>();
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                System.out.println("index found " + map.get(diff) + " and " + i);
                break;
            } else {

            }
            map.put(arr[i], i);

        }

    }
}
