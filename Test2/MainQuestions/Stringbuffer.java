package Test2.MainQuestions;

public class Stringbuffer {
    public static void main(String[] args) {
        String originalString = "Gokulnath K??";
         StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();
        stringBuffer.toString();
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + stringBuffer);
    }
}
