
import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("welcome bubble sort!");
        int[] arr = { 3, 1, 5, 12, 6, 3, 8, 2 };
        int temp;
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("Inc Sorted array:");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Dec Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

}
