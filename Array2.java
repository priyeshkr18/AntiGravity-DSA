import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take size
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // take input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sort array
        Arrays.sort(arr);

        // print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
