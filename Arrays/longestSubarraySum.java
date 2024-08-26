package Arrays;
public class longestSubarraySum {
    //brute sol -->O(n3)
    public static void bruteLongestSubarraySum(int arr[],int k){
        int max_len=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                for(int z=j;z<n;z++){
                    sum+=arr[k];
                }

                
                if(sum==k){
                    //update max_len
                    max_len=Math.max(max_len, (j-i)+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
