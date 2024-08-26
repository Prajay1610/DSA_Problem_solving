package Arrays;
import java.util.ArrayList;




class rotateArraybyk{
    public static void Reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void Rotateright(int arr[],int n,int k){
        
        ArrayList<Integer> temp = new ArrayList<>();
        k=k%n;
        //traverse  last n-k elem and insert them in temp
        for(int i=n-k;i<n;i++){
            temp.add(arr[i]);
        }
        //now insert first elems after that in the temp
        for(int i=0;i<n-k;i++){
            temp.add(arr[i]);
        }

        //copy whole temp in theoriginal array
        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }

    }
    
    public static void Rotateleft(int[] arr,int n,int k){
        k=k%n;
        ArrayList<Integer> temp = new ArrayList<>(n);
        
        //now insert first elems after that in the temp
        for(int i=k;i<n;i++){
            temp.add(arr[i]);
        }
        //traverse first k elem and insert them in temp
        for(int i=0;i<k;i++){
            temp.add(arr[i]);
        }
        

        //copy whole temp in the original array
        for(int i=0;i<n;i++){
            arr[i]=temp.get(i);
        }
    }
    
    public static void OptimizedRotateleft(int[] arr,int n,int k){
        k=k%n;
        //reverse first k elems
        Reverse(arr, 0, k-1);
        //reverse rest of array
        Reverse(arr, k, n-1);
        //reverse entire array
        Reverse(arr, 0, n-1);
       
    }

    public static void OptimizedRotateright(int[] arr,int n,int k){
        k=k%n;
        //reverse last n-k elems
        Reverse(arr, n-k, n-1);

        //reverse rest of elems
        Reverse(arr, 0,k);

        //reverse entire array
        Reverse(arr, 0, n-1);
    }
    
    public static void printArray(int arr[],int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
          }
    }
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        // Rotateright(arr, n, k);
        // System.out.println("After Rotating the elements to right ");
        // printArray(arr, n);
        // Rotateleft(arr, n, k);
        // printArray(arr, n);
        // OptimizedRotateleft(arr, n, k);
        Rotateright(arr, n, k);
        printArray(arr, n);
    }
}