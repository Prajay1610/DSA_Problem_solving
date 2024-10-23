package Strings_Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Basics01 {
    public static void main(String[] args) {
        String str = "Prajay Chavan";

       System.out.println(str.toUpperCase());

       System.out.println(str.toLowerCase());
        //converts string to byte array which contains the ascii values of all the characters in the string
       byte[] ch = str.getBytes();

    //    for(byte e:ch){
    //     System.out.println(e);
    //    }


       String str2 = "Prajay Chavan";
       System.out.println("== checks for ref equality");
       System.out.println(str2==str);//false
       System.out.println("equals checks content equality: "+str.equals(str2));//true

        System.out.println("char @ index 2: "+str2.charAt(2));

        System.out.println("Length of string: "+str2.length());

        System.out.println("indexOf a: "+str2.indexOf("a"));//returns first index of the occurrence of a

        System.out.println("lastIndexOf b: "+str2.lastIndexOf("a"));

        //converting string to character Array
        char ch1[] = str2.toCharArray();

        System.out.println(ch1[0]);
        ch1[0]='P';
        System.out.println(ch1);

        System.out.println("Displaying character array: ");
        for(char e:ch1){
            System.out.print(e);
        }

        System.out.println();

        String newStr=new String();
        for(int i =0;i<ch1.length;i++){
            newStr+= ch1[i];
        }

        System.out.println("displaying new Str:"+newStr);

        //lexographically compares two strings
        System.out.println("Anil".compareTo("Aniket"));


        String s9 = "       Prajay Chavan ";
        System.out.println(s9=s9.trim());//all spaces trimmed from front and back both

        System.out.println("starts with: "+s9.startsWith("Prajay"));
        System.out.println("Ends with: "+"Sunbeam".endsWith("am"));

        //Substring
        System.out.println("===Substring==");

        String s8 = "Sunbeam Pune";
        System.out.println(s8.substring(1));

        //Start index is inclusive
        //end index is exclusive
        System.out.println(s8.substring(1, 5));

        //same as subsequence
        System.out.println("==Subsequence===");
        String s7 = "Sunbeam Pune";

        System.out.println(s7.subSequence(1, 5));
        

        System.out.println("==Reverse a string==");
        String s11 = "Sky is blue";
        char[] s12=s11.toCharArray();
        List<Character> chlist = new ArrayList<>(); 
        for(char c:s12){
            chlist.add(c);
        }

        System.out.println("==Printing list of string chars==");
        System.out.println(chlist);
        Collections.reverse(chlist);

        System.out.println(chlist);

        //extract the company name only i.e gmail
        String email = "Prajay@gmail.com";

        //Way1
        System.out.println("==way1==");
        String[] emailArr= email.split("@");
        String lastPart= emailArr[emailArr.length-1];
        int dotIndex = lastPart.lastIndexOf('.');

        
        String dname = lastPart.substring(0,dotIndex);
        System.out.println(dname);
        

        //way2
        System.out.println("==way2==");
        int atpos = email.lastIndexOf('@');
        int dotpos = email.lastIndexOf('.');

        String cname = email.substring(atpos+1, dotpos);
        System.out.println(cname);
        
        // for(String c:result){
        //     System.out.println(c);
        // }

        System.out.println("=============StringBuilder=========");

        StringBuilder name1 = new StringBuilder("Prajay");
        StringBuilder name2 = new StringBuilder("Prajay");
        StringBuilder name3 = new StringBuilder("Prajay");
        StringBuilder name4 = name1;

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        System.out.println(name1.equals(name4));

        name4.append("Chavan");

        System.out.println("after append on name4");
        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));
        //even after changing name4 still name1 and name4 are equal which means they are pointing at same memory location
        System.out.println(name1.equals(name4));
        //true coz they refer to same memory location
        System.out.println(name1==name4);

        

       
      
        

        


        

       

    }
}
