package Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class findUnion {
    public static void printAns(List<Integer> Union){
        System.out.println("Printing final Union array:");
        for(int elem:Union){
            System.out.print(elem+" ");
        }
    }

    //Brute force approach -->T.C==>O(n)+O(n)+O(n)
    public static void bruteFindUnion(int[] arr1,int[] arr2){
        List<Integer> Union = new ArrayList<>();
        Set<Integer> st = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            st.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            st.add(arr2[i]);
        }

        for(int elem:st){
            Union.add(elem);
        }

        printAns(Union);
        
    }
    
    //Optimal Using 2 pointers
    public static void optimalsol(int[] arr1,int[] arr2){
        List<Integer> Union = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        int left =0,right=0;

        while(left<m&&right<n){
            if(arr1[left]<=arr2[right] ){//case 1
                if(Union.size()==0||Union.get(Union.size()-1)!=arr1[left]){
                    Union.add(arr1[left]);
                }   
               
                left++;

            }
            else {//case 2
                if(Union.size()==0||Union.get(Union.size()-1)!=arr2[right]){
                    Union.add(arr2[right]);
                }
                
                right++;
            }
        }
        while(left<m){
            if(Union.get(Union.size()-1)!=arr1[left]){
                Union.add(arr1[left]);
            }
           
            left++;
        }
        while(right<n){
            if(Union.get(Union.size()-1)!=arr2[right]){
            Union.add(arr2[right]);
            }
            right++;
        }

        printAns(Union);
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5,7};
        int arr2[] = {2, 3, 4, 4, 5,6,9};
        // bruteFindUnion(arr1,arr2);
        optimalsol(arr1, arr2);
    }
}
