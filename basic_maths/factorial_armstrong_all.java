package basic_maths;

public class factorial_armstrong_all {
    public static int factorial(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    
    public static int recfactorial(int num){
        
        if(num<=1) return 1;
        return num*recfactorial(num-1);
    }
    
    public static int reverseNumber(int num){
        
        int revnum =0;
        
        while(num>0){
            int lastDigit = num%10;
            revnum = lastDigit + revnum*10;
            num=num/10;
        }
        
        return revnum;
    }

    
    public static boolean ispallindrome(int num){
        int dups = num;
        
        int rev =reverseNumber(dups);
        
        if(rev==num){
            return true;
        }
        return false;
    }
    
    public static boolean isArmstrong(int num){
        int dup =num;
        int noOfdig= (int)Math.log10(dup)+1;
        int sum=0;
        while(dup>0){
            int lastDigit = dup%10;
            sum = sum + (int)Math.pow(lastDigit,noOfdig);
            dup=dup/10;
        }
        
        if(sum==num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n =7;
        int x=134599;
        int z =12;
        int k=372;
        
        int count = (int)(Math.log10(x))+1;
        System.out.println("no of digits: "+count);
        System.out.println(factorial(n));
        System.out.println(recfactorial(n));
        System.out.println("check pallindrome: "+ispallindrome(z));
        System.out.println("check armstrong: "+isArmstrong(k));
        
    }
}
