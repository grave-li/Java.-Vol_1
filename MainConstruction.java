
/**
 *Java 1. Homework #2.
 *
 * @author Grave Elizaveta
 * @version 13.02.2021
 *
 */

class MainConstruction {
    public static void main(String[]args) {
        System.out.println(checkSum(5, 3));
        checkNum(9);
        System.out.println(checkValue(-5));
        printText("word", 3);
    }

    //1
    static boolean checkSum(int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }

    //2
    static void checkNum(int a) {
        System.out.println((a >= 0) ? "Positive" : "Negative");
    }

    //3
    static boolean checkValue(int n) {
        return n < 0;
    }

    //4

    static void printText(String word, int m) {
        for (int i = 0; i < m; i++) {
            System.out.println("word");
        }
    }


}