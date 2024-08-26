package Arrays;

public class moveZerosend {
    public static int[] moveZeros(int n,int[] arr){
        
        int fidx=-1;//fist index to locate first zero
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                fidx=i;
                break;
            }
        }
        //if no zeros(edge case)
        if(fidx==-1) return arr;

        //traverse from first index and next pointer j from fidx+1 --> n 
        int i =fidx;
        for(int j=i+1;j<n;j++){
            if(arr[j]!=0){
                //swap arr[i] and arr[j]
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                //increment i
                i++;
            }
        }

        //return the array after moving zeros to end
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 0, 4, 0, 1};
        int n = 7;
        int[] ans = moveZeros(n, arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("");
    }
}
