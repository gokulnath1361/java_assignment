package Test2.MainQuestions;

import java.util.StringJoiner;

public class StringJoining {
    public static void main(String[] args) {
        String str1 = "Gokul";
        String str2 = "nath K";
        // Using + method
        String result1 = str1 + str2;
        System.out.println("Using + operator: " + result1);
        // Using concat method
        String result2 = str1.concat(str2);
        System.out.println("Using concat method: " + result2);
        // Using format method
        String result3 = String.format("%s %s", str1, str2);
        System.out.println("Using format method: " + result3);
        // Using joined method (Java 8+)
        String result4 = String.join("",str1, str2);
        System.out.println("Using joined method: " + result4);
        // Using StringJoiner class (Java 8+)
        StringJoiner stringJoiner = new StringJoiner("");
        stringJoiner.add(str1).add(str2);
        String result5 = stringJoiner.toString();
        System.out.println("Using String Joiner class: " + result5);
        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1).append(str2);
        String result6 = stringBuilder.toString();
        System.out.println("Using StringBuilder: " + result6);
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str1).append(str2);
        String result7 = stringBuffer.toString();
        System.out.println("Using StringBuffer: " + result7);
    }
}
