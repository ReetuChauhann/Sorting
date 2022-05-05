import java.util.ArrayList;
import java.util.List;

public class findduplicateinrange {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> b = dupliinrange(arr);
        System.out.println(b);

    }
    
    static List<Integer> dupliinrange(int[] arr){
        int i=0;
        while(i<arr.length){
            int cindex=arr[i]-1;
            if(arr[i]!=arr[cindex]){
                swap(arr,i,cindex);
            }else{
                i++;
            }
        }
        //duplicates
        List<Integer> a= new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                a.add(arr[index]);
            }
        }
        return a;
    }
    static void swap(int[] arr, int sindex, int eindex){
        int temp= arr[sindex];
        arr[sindex]=arr[eindex];
        arr[eindex]=temp;
    }
}
