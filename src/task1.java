import java.util.Scanner;
import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        isArraySortedAscending();
    }
    public static int[] array() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers should array contain: ");
        n = sc.nextInt();
        System.out.print("Enter your numbers: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
    public static void isArraySortedAscending() {
        int[] unsortedArray = array();
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        System.out.println(unsortedArray == sortedArray);
    }
}
