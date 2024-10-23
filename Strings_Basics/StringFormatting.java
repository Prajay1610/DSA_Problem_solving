package Strings_Basics;

public class StringFormatting {
    public static void main(String[] args) {
        //concatenation of strings
        //case 1:
        String s = "SHA"+256+9;
        System.out.println(s);    

        //case 2:
        String s2 = 10+10+"256";
        System.out.println(s2);

        //case 3:
        //because first bracket evaluates and then the concatenation occurs
        String s3 = "SHA"+(250+6);
        System.out.println(s3);

        //String formatting
        double num = 67.6789998;
        System.out.printf("Number is: %.2f",num);
        System.out.println();
        String address ="Nasik";
        String name2 =String.format("Number is: %.2f address is: %s",num,address);
        System.out.println(name2);
    }
}
