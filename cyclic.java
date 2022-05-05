import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void cyclicsort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int sindex, int eindex){
        int temp=arr[sindex];
        arr[sindex]=arr[eindex];
        arr[eindex]=temp;
    }
}
