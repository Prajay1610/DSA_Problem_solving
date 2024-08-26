package Arrays;

public class maxConsecutiveOnes {
    public static int brutemaxones(int[] arr){
        int n = arr.length;
        int max_cnt=0;
        int count =0;
        for(int i=0;i<n;i++){
            
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }

            max_cnt=Math.max(max_cnt, count);
            
        }
        return max_cnt;
        
    }
    public static void main(String[] args) {
        int arr[] = { 1,  0, 1, 1, 1 };
       
        System.out.println("Max consec ones by brute: "+brutemaxones(arr));
    }
}
