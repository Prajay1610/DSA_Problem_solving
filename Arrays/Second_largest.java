package Arrays;

public class Second_largest {
    public static int efficientSol(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int seclargest=-1;
        for(int i =0;i<n;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest = arr[i];
            }
            else if(arr[i]==largest){
                continue;
            }
            else{
                if(seclargest==-1){
                    seclargest=arr[i];
                }
                else if(arr[i]>seclargest){
                    seclargest=arr[i];
                }
                else{
                    continue;
                }
            }
        }
        return seclargest;
    }
    public static void main(String args[]){
        int[] arr = {5,20,12,20,8};
        System.out.println("Second largest elem is: "+efficientSol(arr));    
    }
    


}
