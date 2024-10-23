package Strings_Basics;

public class StringIQ {

    public static void main(String[] args) {
        String email = "Prajay@gmail.com";

        String[] strarr = email.split("@");
        String firstPart = strarr[0];
        System.out.println(firstPart);

        //to get company domain name only eg:gmail
        int indexOfat = email.lastIndexOf("@");
        int indexOfdot = email.lastIndexOf(".");
        String domain = email.substring(indexOfat+1, indexOfdot);
        System.out.println("domain is: "+domain);
    }
    
}
