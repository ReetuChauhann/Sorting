public class findduplicate {
    public static void main(String[] args) {
       // int[] arr={1,3,4,2,2};
       int[] arr={3,1,3,4,2};
        int ans = duplicateNo(arr);
        System.out.println(ans);

    }
    static int duplicateNo(int[] arr){
        int i=0;
        while(i<arr.length){
            int cindex=arr[i]-1;
            if(arr[i]!=arr[cindex]){
                swap(arr,i,cindex);
            }else{
                i++;
            }

        }
        //searching for duplicate element
        for(int index=0; index<arr.length; index++){
            if(arr[index]!=index+1)
            return arr[index];
        }
    return -1; // means there is no duplicate element here!
    }
    static void swap(int[] arr, int sindex, int eindex){
        int temp=arr[sindex];
        arr[sindex]=arr[eindex];
        arr[eindex]=temp;
    }
}
