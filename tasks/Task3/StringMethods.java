package tasks.Task3;

public class StringMethods {
     public static void main(String[] args) {
        // Creating a String
        String str = "Hello, World!";

        // Length of the String
        int length = str.length();
        System.out.println("Length: " + length);

        // Concatenation
        String anotherStr = " How are you?";
        String concatenatedStr = str.concat(anotherStr);
        System.out.println("Concatenated String: " + concatenatedStr);

        // Substring
        String substring = str.substring(7); 
        System.out.println("Substring: " + substring);

        // IndexOf
        int index = str.indexOf("World"); 
        System.out.println("Index of 'World': " + index);

        // CharAt
        char charAt5 = str.charAt(5); 
        System.out.println("Character at index 5: " + charAt5);

        // ToLowerCase and ToUpperCase
        String lowercase = str.toLowerCase();
        String uppercase = str.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        // Replace
        String replacedStr = str.replace("Hello", "Hi");
        System.out.println("After Replacement: " + replacedStr);

        // Trim
        String withSpaces = "   HelloWorld   ";
        String trimmedStr = withSpaces.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");

        // Equals and EqualsIgnoreCase
        String compareStr = "hello, world!";
        boolean equals = str.equals(compareStr);
        boolean equalsIgnoreCase = str.equalsIgnoreCase(compareStr);
        System.out.println("Equals: " + equals);
        System.out.println("EqualsIgnoreCase: " + equalsIgnoreCase);
     }

}
