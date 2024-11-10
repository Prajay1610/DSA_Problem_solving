package Arrays;
/*Return true if the array has a subarray with sum=k,else return false*/
public class Subarray_with_sum {
    public static boolean optimalSol(int[] arr,int k){
        /*T.C ==>O(n+n) not O(n^2) as shrink is done only for some elements */
        int n = arr.length;
        int l =0;
        int r=0;
        int sum =0;
        while(r<n){
            sum+=arr[r];
            while(sum>k){
                sum=sum-arr[l];
                l++;
            }
            if(sum==k) return true;
            r++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};

        boolean ans=optimalSol(arr,33);

        System.out.println(ans?"Subarray with sum exits!":"Subarray doesnt exist!");
    }
    
}
