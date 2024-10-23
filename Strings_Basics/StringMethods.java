public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String subStr = str.substring(7, 12); // Output: "World"
        
        // System.out.println(subStr);

        // System.out.println(str.valueOf("a"));
        Object o = new Object();
        System.out.println(o.toString());

        StringBuilder sb = new StringBuilder("Hi");
        sb.append(o);
        System.out.println(sb);


    }
}
