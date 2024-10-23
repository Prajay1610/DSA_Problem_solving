package IMP_ALGO;
import java.util.ArrayList;
//maximum subarray sum

/*Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray. */


/*Example 1:
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output:
 6 

Explanation:
 [4,-1,2,1] has the largest sum = 6. */

public class Kadane_algo {
    public static int maxSubarraySum(int[] arr,int n){
        int maxisum=Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<n;i++){
            //calc running sum
            sum+=arr[i];

            if(sum<0){
                sum=0;
            }

            if(sum>maxisum){
                maxisum=sum;
            }   
        }
        return maxisum;
    }

    //if asked to find the subarray which gives max sum
    public static ArrayList<Integer> subarraywithmaxsum(int[] arr,int n){
        ArrayList<Integer> list = new ArrayList<>();

        int maxiSum = Integer.MIN_VALUE;
        int sum =0;
        int start=-1;
        int ans_start = -1;
        int ans_end=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>maxiSum){
                maxiSum=sum;
                ans_start=start;
                ans_end=i;
            }

            if(sum<=0){
                sum=0;
                start = i+1;
            }

        }
        list.add(ans_start);
        list.add(ans_end);
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        ArrayList<Integer> ans = subarraywithmaxsum(arr, n);

        System.out.println("Start and end index are:" );
        for(int elem:ans){
            System.out.print(elem+",");
        }
        System.out.println();

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
  
}
