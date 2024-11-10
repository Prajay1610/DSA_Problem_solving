package Arrays;

public class Maximum_Difference{
    public static int bruteSol(int[] arr){
        int n = arr.length;
        int maxdiff=Integer.MIN_VALUE;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(arr[j]-arr[i]>maxdiff){
                    maxdiff=arr[j]-arr[i];
                }
            }
        }

        return maxdiff;
    }

    public static  int optimalSol(int[] arr){
        int n = arr.length;

        int minelem = arr[0];
        int maxdiff = arr[1] - arr[0];

        for(int i=1;i<n;i++){
            maxdiff=Math.max(maxdiff, arr[i]-minelem);
            if(arr[i]<minelem){
                minelem=arr[i];
            }

        }

        return maxdiff;
    }
    public static void main(String args[]){
        int[] arr = {2,3,10,6,4,8,1};
        // arr={30,10,8,2};
    

        // System.out.println("Maximum difference is: "+bruteSol(arr));
        System.out.println("Maximum difference is: "+optimalSol(arr));
    }
}
