import java.util.Random;

public class OTPGenerator {
    public static void main(String[] args) {

        Random random = new Random();

        int otp = 100000 + random.nextInt(900000);

        System.out.println("========== OTP GENERATOR ==========");
        System.out.println("Your OTP is: " + otp);
        System.out.println("===================================");
    }
}
