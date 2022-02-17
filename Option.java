class Option {
    public static void main(String[]args) {
        if (args[0].equals("-en")) {
            System.out.println("English language optin");
        } else if (args[0].equals("-es")) {
            System.out.println("Spanish language optin");
        } else
            System.out.println("Unknown optin");
    }

}