import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome! " + name);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 60) {
            System.out.println("You are eligible for VRIDDHA pension");
        } else {
            System.out.println("Sorry! You are not eligible for VRIDDHA pension");
        }

    }
}