package Strings_Basics;

public class String_Subsequence {
    //iterative solution ==> T.C=O(m+n) S.C=O(1)
    public static boolean isSubsequence(String s1,String s2,int m,int n){
        int j =0;
        for(int i=0;i<m && j<n ;i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==n);
    }
    //recursive solution ==> T.C=O(m+n) S.C=O(m+n) coz of recursive function calls requires a stack 
    public static boolean recisSubsequence(String s1,String s2,int m,int n){
        if(n==0){
            return true; 
        }
        if(m==0){
            return false;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return recisSubsequence(s1, s2, m-1, n-1);
        }
        else{
            return recisSubsequence(s1, s2, m-1, n);
        }
    }
    public static void main(String[] args) {
        String s1 ="ABCD";
        String s2 = "AC";
        int m =s1.length();
        int n = s2.length();
        // boolean result = isSubsequence(s1,s2,m,n);
        boolean result = recisSubsequence(s1,s2,m,n);
        System.out.println("S1 is subsequence of S2? : "+result);
    }
}
