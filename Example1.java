class Example1 {
    public static void main(String[]agrs) {
        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 6; i++) {
                if (i < 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}