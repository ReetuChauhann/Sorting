import java.util.*;
public class missingnumberinrange {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> b=missingNo(arr);
        System.out.println(b);

    }

    static List<Integer> missingNo(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctind=arr[i]-1;
            if(arr[i]!=arr[correctind]){
                swap(arr,i,correctind);
            }else{
                i++;
            }
        }
        //searching the missing numbers
        List<Integer> a=new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1){
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
