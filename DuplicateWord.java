import java.util.*;

public class DuplicateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words (type 'stop' to finish):");

        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String word = sc.nextLine().trim().toLowerCase();

            if (word.equals("stop")) {
                break;
            }

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Words appearing more than once:");

        boolean found = false;
        for (String w : map.keySet()) {
            if (map.get(w) > 1) {
                System.out.println(w + " -> " + map.get(w) + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate words found!");
        }
    }
}
