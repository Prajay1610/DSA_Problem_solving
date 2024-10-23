package Strings_Basics;
import java.util.Collections;
import java.util.Stack;
import java.util.Arrays;
public class ReverseWords{

        // Function to reverse words in a given string.
        public static String reverseWords(String str) {
            // code here
           
          String[] sarr = str.split(".");
          System.out.println(Arrays.toString(sarr));
          Collections.reverse(Arrays.asList(sarr));
          String result = sarr[0];
           for(int i=1;i<sarr.length;i++){
               result = result+"."+sarr[i];
           }
            
            return result;
        }

        //Approach2:Using stack 
        public static String revWordsUsingStack(String str){
            //S.C==> o(n)+o(n)= O(2n);
            StringBuilder sb = new StringBuilder();
            Stack<String> revString = new Stack<>();
           
            //T.C==>O(n)
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!='.'){
                    //form the word
                    sb.append(str.charAt(i));
                }
                else{
                    //push the formed word onto the stack
                    revString.push(sb.toString());
                    sb.setLength(0);
                }
            }

            //opearations of stack take o(1) time 
            String result =revString.pop();
            while(!revString.isEmpty()){
                result=result+"."+revString.pop();
            }

            // System.out.println(result);
            
            return result;
            
        }
    public static void main(String[] args) {
        String str="i.like.this.program.very.much";
        // reverseWords(str);
        revWordsUsingStack(str);
    }
}