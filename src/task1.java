import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(isArraySortedAscending());
    }
    public static int[] readArrayFromInput() {
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
    public static boolean isArraySortedAscending() {
        boolean sorted=false;
        int[] inputArray = readArrayFromInput();
        for (int i= 0; i< inputArray.length-1; i++ ){
            sorted = inputArray[i] <= inputArray[i+1];
            if(!sorted){
                break;}
        }
        return sorted;
    }
}
