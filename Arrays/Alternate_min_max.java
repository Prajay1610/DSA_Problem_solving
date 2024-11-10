package Arrays;
public class Alternate_min_max {
    public static void bruterearrange(long[] arr,int n){
        int s=0;
        int e=n-1;
        
        long[] dup = new long[n];
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(flag){
                dup[i]=arr[e--];
            }
            else{
                dup[i]=arr[s++];
            }
            flag=!flag;
        }
        
        for(int k=0;k<n;k++){
            arr[k]=dup[k];
        }
    }
    public static void main(String[] args)
    {
        long[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        System.out.println("Original Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
      
            bruterearrange(arr, n);

        System.out.println("\nModified Array");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    } 
}
