import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int div = scanner.nextInt();
        int count = 0;

        System.out.println("Numbers divisible by " + div + " between " + a + " and " + b + ":");

        for (int i = a; i <= b; i++) {
            if (i % div == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal numbers divisible: " + count);

    }
}
