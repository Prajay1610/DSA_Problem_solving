import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Initialize a counter to keep track of special characters
        int specialCharCount = 0;

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {
            // Check if the character is a special character (you can define your own criteria)
            if (isSpecialChar(c)) {
                specialCharCount++;
            }
        }

        // Print the count of special characters
        System.out.println(specialCharCount);

        scanner.close();

    }

    private static boolean isSpecialChar(char c) {
        // Example: Consider characters that are not letters or digits as special
        return !Character.isLetter(c) && !Character.isDigit(c);
    }
    

}
