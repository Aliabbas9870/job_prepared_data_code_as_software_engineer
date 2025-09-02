
import java.util.Arrays;

public class insert_sort {
    public static void main(String[] args) {
        System.out.println("welcome insert sort!");
        int[] arr={5,4,1,7,4,9,74,3};


        // assendinng /

        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>cur){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=cur;
        }

        System.out.println(Arrays.toString(arr));

    // desc 

          for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]<cur){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=cur;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
