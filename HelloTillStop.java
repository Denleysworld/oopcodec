import java.util.*;

class HelloTillStop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String choice;
        System.out.println("For Hello type h,anything else to stop");
        choice = scanner.nextLine();
        while (choice.equals("h")) {
            System.out.println("Hello");
            System.out.println("For Hello type h,anything else to stop");
            choice = scanner.nextLine();
        }
        
        
    }
}
