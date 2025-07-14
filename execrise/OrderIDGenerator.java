
import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args) {
    Random random = new Random();
    String[] orderIds = new String[5];
    for (int i = 0; i < orderIds.length; i++) {
        char prefix = (char) ('A' + random.nextInt(5)); 
        int number = random.nextInt(999)+1;
        String suffix = String.format("%03d", number); // Format number to 3 digits
        orderIds[i] = prefix + suffix; // Concatenate prefix and suffix
    }
    for (String orderId : orderIds) {
        System.out.println(orderId); // Print each generated order ID
    }
    }
    
}
