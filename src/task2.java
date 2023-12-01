public class task2 {

    //I decided to delete stringToArrayToArrayToString because it was faulty and recommended fix would make it similar
    // to stringToArrayAndBackToString method

    static void stringToArrayAndBackToString(String stringToReverse) {
        System.out.println("Initial String: " + stringToReverse);
        char[] dest_array = stringToReverse.toCharArray();
        System.out.print("Reversed String: ");
        for(int i = dest_array.length - 1; i >= 0; --i) {
            System.out.print(dest_array[i]);
        }
        System.out.println();
        System.out.println();
    }

    static void whileLoop(String stringToReverse) {
        System.out.println("Initial String: " + stringToReverse);
        System.out.print("Reversed String: ");
        int n = stringToReverse.length();
        while (n > 0){
            System.out.print(stringToReverse.charAt(n - 1));
            --n;
        }
        System.out.println();
        System.out.println();
    }

    static void forLoop(String stringToReverse) {
        System.out.println("Initial String: " + stringToReverse);
        System.out.print("Reversed String: ");
        for(int n = stringToReverse.length(); n > 0; --n) {
            System.out.print(stringToReverse.charAt(n - 1));
        }

        System.out.println();
        System.out.println();
    }

    static void stringBuilder(String stringToReverse) {
        System.out.println("Initial String: " + stringToReverse);
        StringBuilder sB = new StringBuilder(stringToReverse.length());
        for(int n = stringToReverse.length(); n > 0; --n) {
            sB.append(stringToReverse.charAt(n - 1));
        }
        System.out.print("Reversed String: " + sB);
        System.out.println();
        System.out.println();
    }

    static void stringBuffer(String stringToReverse) {
        System.out.println("Initial String: " + stringToReverse);
        StringBuffer sbfr = new StringBuffer(stringToReverse);
        sbfr.reverse();
        System.out.print("Reversed String: " + sbfr);
        System.out.println();
        System.out.println();
    }
    // I considered making 1 function for printing to reduce duplication
    // but decided it was better to keep methods separate
    //  to make it easy to see right away, if functions work correctly.

    public static void main(String[] args) {
        String stringToReverse = "I'm going to go to school today morning.";
        stringToArrayAndBackToString(stringToReverse);
        whileLoop(stringToReverse);
        forLoop(stringToReverse);
        stringBuilder(stringToReverse);
        stringBuffer(stringToReverse);
    }
}
