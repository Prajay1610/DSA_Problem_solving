package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Array_subset_of_other{
    public static String BetterSol(int[] a1,int a2[], int n, int m){
        Arrays.sort(a1);
       Arrays.sort(a2);
       
       int l=0;
       int r=0;
      
       
       while(l<a2.length && r<a1.length){
           
           if(a2[l]==a1[r]){
                l++;
                r++;
               
           }
           else if(a1[r]<a2[l]){
               r++;
           }
           else{
               return "No";
           }
       }
       
       if(l==a2.length) return "Yes";
       
       
       return "No";
        
    
    }
    
    public static String OptimalSol(int[] a1,int a2[], int n, int m){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i =0;i<a1.length;i++){
            hmap.put(a1[i],hmap.getOrDefault(a1[i], 0)+1);
        }
    // Check if each element in array a2 is present in array a1 and decrement its frequency
        for(int i=0;i<m;i++){
            if(hmap.containsKey(a2[i])){
                 // If frequency becomes 1, remove the element from the hash map
                if(hmap.get(a2[i])==1){
                    hmap.remove(a2[i]);
                }
                else{
                     // Decrement the frequency of the element
                    hmap.put(a2[i],hmap.get(a2[i])-1);
                }
            }
            else{
                return "No";
            }
        }

        return "Yes";
        
    }
    public static void main(String[] args) {
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] a2 = {11, 3, 7, 1, 7};
        int n=8;
        int m=5;

        System.out.println(BetterSol(a1,a2,n,m));
        System.out.println(OptimalSol(a1,a2,n,m));

    }
}