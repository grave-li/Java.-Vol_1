
/*
Программа, использующая константы
*/

class Constants {
    public static void main(String[]args) {
        final int TOUCHDOWN = 6 ;
        final int CONVERSATION = 1 ;
        final int FIELDGOAL = 3 ;
        int td , pat , fg , total ;
        td = 4 * TOUCHDOWN ;
        pat = 3 * CONVERSATION ;
        fg = 2 * FIELDGOAL ;
        total = ( td + pat + fg ) ;
        System.out.println( "Total " + total ) ;
    }
}