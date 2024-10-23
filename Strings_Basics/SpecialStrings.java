import java.util.ArrayList;
import java.util.Scanner;
/*A string is considered as special if the string cotains two matching adjacent characters */
public class SpecialStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        ArrayList<String> str = new ArrayList<>();
       
        int specialCount=0;
        while((T)!=0){
           
            str.add(sc.next());
            T--;
        }
       
        for(String s:str){
            boolean flag = false;
                int i =0;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                       flag=true;
                       break;
                    }
                    i++;
                }
                
            
            if(flag){
                specialCount++;
            }
        }

        System.out.println("Special strings count is: "+specialCount);

    }
}
