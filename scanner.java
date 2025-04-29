import java.util.Scanner;
public class scanner {
    //a simple demmo of input in java to output Hi,My name is <name> and I am <age> years old
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    
}
