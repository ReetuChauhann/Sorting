import java.util.*;

public class setmismatch {
    public static void main(String[] args) {
        //int[] arr={1,2,2,4};
        int[] arr={1,1};
        
        List<Integer> b= setmatch(arr);
        System.out.println(b);
    }
    static List<Integer> setmatch(int[] arr){
        int i=0;
        while(i<arr.length){
            int cindex=arr[i]-1;
            if(arr[i]!=arr[cindex]){
                swap(arr,i,cindex);
            }else{
                i++;
            }
        }
        List<Integer> a= new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
                a.add(arr[index]);
                a.add(index+1);
            }
        }
        return a;
    }

    static void swap(int[] arr, int find,int eind){
        int temp=arr[find];
        arr[find]=arr[eind];
        arr[eind]=temp;
    }
}
