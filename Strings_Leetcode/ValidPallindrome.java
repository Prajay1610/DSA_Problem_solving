package Strings_Leetcode;

public class ValidPallindrome {
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);

        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(sb);
      return sb.toString();
    
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String dup = s;
        dup=dup.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        String reveString=reverseString(dup);
        System.out.println(dup);
        if(dup.equals(reveString)) System.out.println("Pallindrome");
        else System.out.println("non pallindrome");

       


    }
}
