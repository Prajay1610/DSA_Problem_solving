package Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Leaders_in_array{
    public static ArrayList<Integer>  printLeadersBruteForce(int[] arr,int n){
        ArrayList<Integer> leader= new ArrayList<>();
        int leader_elem = arr[0];
       
        for(int i=0;i<arr.length-1;i++){
            boolean flag=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    leader_elem=arr[i];
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                leader.add(leader_elem);
            }
           
            
            
        }
        leader.add(arr[n-1]);//for rightmost elem as it is always the leader
        return leader;
    }
  
    public static ArrayList<Integer> printLeadersOptimal(int[] arr,int n){
        ArrayList<Integer> list = new ArrayList<>();
        int maxelem=Integer.MIN_VALUE;

        for(int i=n-1;i>0;i--){
            if(arr[i]>maxelem){
                maxelem=arr[i];
                list.add(arr[i]);
            }
        }
        //if told to return in same order
        Collections.reverse(list);

        return list;
    }
    public static void main(String[] args) {
         // Array Initialization.
  int n = 6;
  int arr[]=  {10, 22, 12, 3, 0, 6};


//   ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
  ArrayList<Integer> ans= printLeadersOptimal(arr,n);
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}