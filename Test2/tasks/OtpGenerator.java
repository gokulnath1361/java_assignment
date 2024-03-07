package Test2.tasks;
import java.util.Random;

public class OtpGenerator {
     private static String generateOTP(int length) {
        String allowedChars = "0123456789";
        StringBuilder otp = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allowedChars.length());
            otp.append(allowedChars.charAt(index));
        }
        return otp.toString();
    }
    public static void main(String[] args) {
        String otp4 = generateOTP(4);
        System.out.println("4-Digit OTP: " + otp4);
        String otp6 = generateOTP(6);
        System.out.println("6-Digit OTP: " + otp6);
    }
}


