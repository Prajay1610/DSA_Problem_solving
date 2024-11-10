package Arrays;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.


Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/
public class Two_Sum {

    public static int[] bruteSol(int[] arr,int target){
        int n = arr.length;

        int[] indices = new int[2];
        for(int i =0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]+arr[i]==target){
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }
        }
        return indices;
    }
    
    //As sorting not possible here as the indexes will change
    // public static int[] optimalSol(int[] arr,int target){
    //     int n = arr.length;

    //     int s=0;
    //     int e = n-1;
    //     int[] indices=new int [2];
    //     while(s<e){
    //         if(arr[s]+arr[e]==target){

    //         }
    //     }
    // }
    public static void main(String args[]){
        int[] arr = {3,3};
        int target = 6;

        int[] res=bruteSol(arr, target);

        for(int elem:res){
            System.out.print(elem+" ");
        }
    }
}
