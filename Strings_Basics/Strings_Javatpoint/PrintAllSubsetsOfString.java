import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsetsOfString {

    public static List<String> getAllSubsets(String s){
        ArrayList<String> subsets = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j =i+1;j<s.length();j++){
                subsets.add(s.substring(i, j+1));
            }
        }

        return subsets;
    }
    public static void main(String[] args) {
        String s = "FUNNY";

        List<String> subsets=getAllSubsets(s);

        for(String str:subsets){
            System.out.print(str+",");
        }
        
    }
}
