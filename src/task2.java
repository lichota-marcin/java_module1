public class task2 {
    public task2() {
    }

    static void stringToArrayToArrayToString() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        char[] charArray = stringToReverse.toCharArray();
        int n = charArray.length;
        char[] dest_array = new char[n];
        int j = n;
        char[] var5 = charArray;
        int var6 = charArray.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            char c = var5[var7];
            dest_array[j - 1] = c;
            --j;
        }

        String reversedString = String.valueOf(dest_array);
        System.out.println("Reversed string: " + reversedString);
        System.out.println();
    }

    static void stringToArrayToString() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        char[] dest_array = stringToReverse.toCharArray();
        System.out.print("Reversed String: ");

        for(int i = dest_array.length - 1; i >= 0; --i) {
            System.out.print(dest_array[i]);
        }

        System.out.println();
        System.out.println();
    }

    static void whileLoop() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        System.out.print("Reversed String: ");

        for(int n = stringToReverse.length(); n > 0; --n) {
            System.out.print(stringToReverse.charAt(n - 1));
        }

        System.out.println();
        System.out.println();
    }

    static void forLoop() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        System.out.print("Reversed String: ");

        for(int n = stringToReverse.length(); n > 0; --n) {
            System.out.print(stringToReverse.charAt(n - 1));
        }

        System.out.println();
        System.out.println();
    }

    static void stringBuilder() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        StringBuilder sB = new StringBuilder(stringToReverse.length());

        for(int n = stringToReverse.length(); n > 0; --n) {
            sB.append(stringToReverse.charAt(n - 1));
        }

        System.out.print("Reversed String: " + sB);
        System.out.println();
        System.out.println();
    }

    static void stringBuffer() {
        String stringToReverse = "Test String";
        System.out.println("Initial String: " + stringToReverse);
        StringBuffer sbfr = new StringBuffer(stringToReverse);
        sbfr.reverse();
        System.out.print("Reversed String: " + sbfr);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        stringToArrayToArrayToString();
        stringToArrayToString();
        whileLoop();
        forLoop();
        stringBuilder();
        stringBuffer();
    }
}
