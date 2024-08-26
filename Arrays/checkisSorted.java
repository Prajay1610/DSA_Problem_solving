package Arrays;

public class checkisSorted {
    public static boolean isSorted(int[] arr,int n){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6}, n = 5;

    System.out.println(isSorted(arr, n));
    }
}
