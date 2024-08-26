package Arrays;
import java.util.Arrays;
public class findMissingNumber {
    public static int brutefindMissingNumber(int[] arr,int n){
        //find missing num between b/w 1 to n
        //if array not sorted sort it
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    
    //using linear search for each elem from  1 to N
    public static int brute2findMissingNumber(int[] arr,int n){
        for(int i=1;i<=n;i++){
            boolean flag =false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag = true;
                    break;
                }
            }

            if(flag==false) return i;
        }
        return -1;
    }
    
    //using hashing (Important)
    public static int findmissinghashing(int[] arr,int n){
        int[] hash = new int[n+1];

        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }

        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            
            }
        }
        return -1;
    }
    
    //optimal sol
    public static int findmissingusingsum(int[] arr,int n){
        //find running sum of all elem in array
        int actual_sum =0;
        int predicted_sum = (n*(n+1))/2;
        for(int i=0;i<n-1;i++){
            actual_sum+=arr[i];
        }

        return predicted_sum-actual_sum;
    }

    //dry run iterations to understand better
    public static int usingxor(int[] arr,int n){
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }
        xor1=xor1^n;//because the last element will be left as the above loop runs from 0 to n-1
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4};
        int n = 4;
        // System.out.println("Missing elem is"+brute2findMissingNumber(arr,n));
        // System.out.println("Missing elem using hashing is: "+findmissinghashing(arr,n));
        // System.out.println("Missing elem using summation is: "+findmissingusingsum(arr,n));
        System.out.println("Missing elem using XOR is: "+usingxor(arr,n));
    }
}
