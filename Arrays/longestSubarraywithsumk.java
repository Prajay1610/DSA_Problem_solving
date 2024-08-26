package Arrays;

public class longestSubarraywithsumk {

    public static int bruteLongestSubarray(int arr[],long k){
        int n = arr.length;
        int max_len=0;
        for(int i=0;i<n;i++){
            int curr_length= 0;
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                curr_length=(j-i)+1;
                if(sum==k){
                    max_len=Math.max(max_len, curr_length);
                }
                
            }
        }
        return max_len;
    }
    public static void main(String[] args) {
        int[] a = {2,3,5};
        long k = 10;
        int len = bruteLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
