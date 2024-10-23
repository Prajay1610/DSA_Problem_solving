public class DivideStringInnequalparts{
    /*https://www.javatpoint.com/java-program-to-divide-a-string-in-n-equal-parts */
    public static void main(String[] args) {
        String s ="aaaabbbbcccc";

        int length = s.length();

        int n = 3;//can vary (n is number of equal parts)

        int chars = length/n;//number of chars in each part

        if(length%n!=0){
            System.out.println("cannot be equally partitioned!");
        }
        else{
            for(int i=0;i<length;i+=chars){
                String subStr = s.substring(i,i+chars);
                System.out.println(subStr+" ");
            }
        }
    }
};