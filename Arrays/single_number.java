package Arrays;

// import java.lang.reflect.Array;

import java.util.HashMap;
import java.util.Map;

// Problem Statement: 
// Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class single_number {

     //brute approach
    public static int brutesinglnum(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int num = arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    count++;
                }
            }
            if(count==1) return num;
        }
        return -1;
    }
    //better-->using hashmap
    public static int singlenumber(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> hash = new HashMap<>();
        
        for(int i=0;i<n;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        } 

        for(HashMap.Entry<Integer,Integer> entry:hash.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
    
    //better2-->using hashing
    public static int hashingsinglenum(int[] arr){
        int n = arr.length;
       
        //size of hash array till max elem + 1 only
        //finding max number
        int max_num=arr[0];
        for(int i=0;i<n;i++){
            max_num = Math.max(arr[i],max_num);
        }

        int[] hash = new int[max_num+1];//auto stores all default values as zero


        for(int i=0;i<n;i++){
          hash[arr[i]]++;
        }

        for(int i=0;i<hash.length;i++){
            if(hash[i]==1){
                return i;
            }
        }

        return -1;

        

    }
    
    //optimal using XOR operator
    public static int xorsinglenum(int[] arr){
        int n = arr.length;
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }

        return xor;
    }
    public static void main(String[] args) {
        int[] array = {4, 7, 4, 3, 7, 3, 2};
        // System.out.println(singlenumber(array));
        // System.out.println(brutesinglnum(array));
        // System.out.println(hashingsinglenum(array));
        System.out.println(xorsinglenum(array));

    }
}
