package Arrays;
public class longestSubarraySum {
    //brute sol -->O(n3)
    public static int bruteLongestSubarraySum(int arr[],long k){
        int max_len=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum =0;
                for(int z=i;z<=j;z++){
                    sum+=arr[z];
                }
                if(sum==k){
                    //update max_len
                    max_len=Math.max(max_len, (j-i)+1);
                }
            }
        }
        return max_len;
    }

    //little optimized one-->O(n2)-->(for both +ve and -ve)

    public static int brute2LongestSubarraySum(int arr[],long k){
        int n = arr.length;
        int max_len = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            int j;
            for(j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    max_len=Math.max(max_len, (j-i)+1);
                }
                
            }

            
        }
        return max_len;
    }
    
    
    //most optimal sol -->using 2 pointer approach(FOR +ve only)
    public static int optimalLongestSubarraySum(int arr[],long k){
        int n = arr.length;
        long sum =0;
        int max_len = 0;
        int left=0,right=0;
        while(right<n){//while right is less than n run this loop

            
            sum+=arr[right];
           
            //now if the sum becomes equal to k then
           if(sum==k){
            max_len=Math.max(max_len,(right-left)+1);

           }

           //if sum becomes greater than k -->trim the array from left to reduce sum
           while(sum>k && left<=right){
            sum-=arr[left];
            left++;
           }

           //increment right first and then sum it
            //make sure we are inside the bounds of array
            right++;
           
            
        }

        return max_len;
    }
    public static void main(String[] args) {
        int[] a={2, 3, 5, 1,1,1,1};
        long k=4;
        System.out.println("Longest subarray with sum "+k+" is: "+bruteLongestSubarraySum(a,k));
        System.out.println("Longest subarray with sum with brute2 "+k+" is: "+brute2LongestSubarraySum(a,k));
        System.out.println("Longest subarray with sum with 2 pointer approach  is: "+optimalLongestSubarraySum(a,k));
    }
}
