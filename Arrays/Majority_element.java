package Arrays;
import java.util.HashMap;
import java.util.Map;
public class Majority_element {
    public static int  majorityElement(int[] nums){
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int majoritycnt=(nums.length)/2;

        for(int elem:nums){
            hmap.put(elem,hmap.getOrDefault(elem,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:hmap.entrySet()){
            if(entry.getValue()>majoritycnt){
                return entry.getKey();
            }
        }

        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2,1,1,3,1};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
