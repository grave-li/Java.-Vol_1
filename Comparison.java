class Comparison {
    public static void main(String[]args) {
        String txt = "Fantastic " ;
        String lang = "Java " ;
        boolean state = (txt == lang) ;
        System.out.println("Equality test: " + state) ;
        state = (txt != lang) ;
        System.out.println("Inequality test: " + state) ;
        int dozen = 12 ;
        int score = 20 ;
        state = (dozen > score) ;
        System.out.println("If more test: " + state) ;
        state = (dozen < score) ;
        System.out.println("If less test: " + state) ;

    }

}