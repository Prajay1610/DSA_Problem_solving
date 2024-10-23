import java.util.Arrays;
import java.util.HashMap;

public class String_anangrams {
    /*        sorting both the strings required */
    /*T.C ==> O(mlogm +nlogn)*/
     public static void main1 (String [] args) {  
        String str1="Brag";  
        String str2="Grab";  
  
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length()) {  
            System.out.println("Both the strings are not anagram");  
        }  
        else {  
            //Converting both the arrays to character array  
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            if(Arrays.equals(string1, string2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  
    } 
    
    
    //aproach2 --> using hashmap
    public static boolean areAnagrams(String s1, String s2) {
      
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create a hashmap to store character frequencies
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character in the first string
        for (char c : s1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Decrement frequency of each character in the second string
        for (char c : s2.toCharArray()) {
            // If character not found in hashmap, return false
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        // Check if all frequencies are zero
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        // If all conditions satisfied, they are anagrams
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        str1 = "gram";
        str2 = "arm";

        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
