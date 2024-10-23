package Strings_Basics;

public class PrintAllSubstrings {
        public static void main(String[] args) {
            //every string has n*(n+1)/2 non empty substrings and 
            //if we want to include empty string also then +1

            // way1
            String name ="abc";
            for(int i=0;i<name.length();i++){
                for(int j=i+1;j<=name.length();j++){
                    System.out.println(name.substring(i, j));
                }
            }
        
        }
}
