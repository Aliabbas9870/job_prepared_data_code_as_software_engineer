import java.util.Arrays;


public class selection_sort {
    
  public static void main(String[] args) {
    
          int[] arr = { 3, 1,  6, 3, 8, 2 };
        int temp;
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }

System.out.print(Arrays.toString(arr));


       for(int i=0;i<arr.length-1;i++){
            int high=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[high]){
                    high=j;
                }
            }
            temp=arr[high];
            arr[high]=arr[i];
            arr[i]=temp;
        }
System.out.println();
System.out.print(Arrays.toString(arr));

    }
}
