package IMP_ALGO;
/*Given an array of integers of size 'n'. Our aim is to calculate 
the maximum sum of 'k' consecutive elements in the array. */

/*Here we use sliding window technique... */

/*Variations can be :
1.find maximum product of k elements within a window
2.find maximum XOR of k elements within a window
3.find maximum LCM of k elements within a window
4.find maximum HCF of k elements within a window
*/
public class Sliding_Window_Technique {
    public static int maxSum(int[] arr,int k){
        int n = arr.length;
        int currsum = 0;
        for(int i =0;i<k;i++){
            currsum+=arr[i];
        }

        int res = currsum;
        for(int i=k;i<n;i++){
            currsum=currsum+arr[i]-arr[i-k];
            res = Math.max(res, currsum);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,8,30,-5,20,7};
        int k=4;
        int ans=maxSum(arr,k);

        System.out.println("Max sum is: "+ans);
    }
}
