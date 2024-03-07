package Test2.MainQuestions;

public class Stringbuilder {
    public static void main(String[] args) {
        String originalString = "Gokulnath";
        StringBuilder stringBuilder = new StringBuilder(originalString);
        stringBuilder.reverse();
        stringBuilder.toString();
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + stringBuilder);
    }
}
