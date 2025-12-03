import java.util.Scanner;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many fruits will you enter? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] fruits = new String[n];

        System.out.println("Enter fruit names:");
        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextLine().toLowerCase();
        }

        System.out.println("Duplicate fruits:");
        for (int i = 0; i < n; i++) {
            int count = 1;

            if (fruits[i].equals("checked")) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (fruits[i].equals(fruits[j])) {
                    count++;
                    fruits[j] = "checked";
                }
            }

            if (count > 1) {
                System.out.println(fruits[i] + " -> " + count + " times");
            }
        }
    }
}
