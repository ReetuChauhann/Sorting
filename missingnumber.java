public class missingnumber {
    public static void main(String[] args) {
        int[] arr={5,0,1,2,3}; //given 0 to n so here i can see that 3 is missing
        int ans=missingNum(arr);
        System.out.println(ans);
    }
    static int missingNum(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }

        //searching missing number
        for(int index=0; index<arr.length; index++){
            if(arr[index]!= index){
                return index;
            }
            
        }
    return arr.length;
    }

    static void swap(int[] arr, int s, int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    
    
}
