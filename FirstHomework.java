
class FirstHomework {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 8, b = 12;
        System.out.println((a + b >= 0) ? "Positive" : "Negative");
    }

    static void printColor() {
        int value = 14;
        if (value <= 0) {
            System.out.println("Red");
        } 
        if (value > 0 & value <= 100) {
            System.out.println("Yellow");
        } 
        else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 12;
        int b = 14;
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }
}

