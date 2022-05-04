import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {45,23,7,55,12,22};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selectionsort(int[] arr){
        for(int i =0; i<arr.length; i++){
            //find max in the remaining and swap it with the correct index
            int last = arr.length-i-1;
            int max= getmaxelement(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getmaxelement(int[] arr, int start, int last){
        int max=start;
        for(int i=start; i<=last; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        } 
        return max;
    }

    static void swap(int[] arr, int findex, int sindex){
        int temp = arr[findex];
        arr[findex]= arr[sindex];
        arr[sindex]= temp;
    }
    
}
