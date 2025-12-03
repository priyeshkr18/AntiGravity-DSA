import java.util.*;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        // Input scores
        System.out.println("Enter scores (0-100):");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // Sort ascending
        Arrays.sort(scores);

        System.out.println("\nSorted Scores with Grades:");
        for (int s : scores) {
            System.out.println(s + " -> " + getGrade(s));
        }
    }

    // Grade function
    public static String getGrade(int score) {
        if (score >= 90) return "O";
        else if (score >= 80) return "A";
        else if (score >= 70) return "B";
        else return "C";
    }
}
