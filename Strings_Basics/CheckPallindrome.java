package Strings_Basics;

public class CheckPallindrome {
    public static boolean isPallindrome(String str){
        
        str = str.toLowerCase();

        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
       
       

        
        return true;
    }
    public static void main(String[] args) {
        String s1 = "NamAN";
        System.out.println("Is Pallindrome: "+isPallindrome(s1));
    }
}
