package Strings_Basics;

public class ReverseString {
    
    public static void main(String[] args) {

        //using 2 pointers --> takes o(n/2)
        //by converting it to characte Array
        String name="Prajay";

        char[] ch = name.toCharArray();

        int start =0;
        int end =ch.length-1;
        while(start<end){
            //swap
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }

        String s2=new String();
        for(char c:ch){
           s2+=c;
        }

        System.out.println(s2);


        //way2:iterate and concatenate  -->T.C O(n)
        String name2="rajat";
        String dupname=new String();
        for(int i=0;i<name2.length();i++){
            dupname=name2.charAt(i)+dupname;
        }
        System.out.println("By way 2:");
        System.out.println(dupname);


        //way3:using StringBuilder
        StringBuilder sb = new StringBuilder(name2);

        int i=0;
        int j=sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }

        System.out.println("Using stringbuilder:");
        System.out.println(sb);
    }
}
