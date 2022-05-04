import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
            // int[] arr = {23,56,78,12,90};
            int[] arr = {-12,-45,0,23,56,78,12,90};
            bubblesort(arr);
            System.out.println(Arrays.toString(arr));
            bubblesortd(arr);
            System.out.println(Arrays.toString(arr));
        
    }

    static void bubblesort(int[] arr){ // in increasing order

        for(int i=0; i<arr.length; i++){ //i for loop for the number of passes it requried
            for(int j=1; j<arr.length-i; j++){ //j will only run till the N-1 bcoz after that array will be sorted so no need to check the further
               if(arr[j-1]>arr[j]){
                  int temp = arr[j-1];
                  arr[j-1]= arr[j];
                  arr[j]=temp;
               }
            }

        }
    }

        static void bubblesortd(int[] arr){ // in decreasing order

            for(int i=0; i<arr.length; i++){ //i for loop for the number of passes it requried
                for(int j=1; j<arr.length-i; j++){ //j will only run till the N-1 bcoz after that array will be sorted so no need to check the further
                   if(arr[j-1]<arr[j]){
                      int temp = arr[j-1];
                      arr[j-1]= arr[j];
                      arr[j]=temp;
                   }
                }
    
            }
    }
    
}
