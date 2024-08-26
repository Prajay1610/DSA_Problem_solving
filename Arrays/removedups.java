package Arrays;

import java.util.HashSet;

public class removedups {
    //for sorted array -->optimal approach
    public static int removeDuplicates(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=i+1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;//first increment i to point to the next dup
                arr[i]=arr[j];//replace value at arr[i] with value at arr[j]
            }
        }

        //returning count of unique elements
        return i+1;
    }

    //brute approach using Hashset
    public static int remDups(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        //traverse and add each elem to hashSet
        for(int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }

        int k = st.size();
        //add back the elem from set to arr from 0 to sizeofset
        int j=0;
        for(int elem:st){
            arr[j]=elem;
            j++;
        }

        return k;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,5,8,8,9};
        // int k = removeDuplicates(arr);
        int z = remDups(arr);
        System.out.println("count of unique elem is: "+z);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < z; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
