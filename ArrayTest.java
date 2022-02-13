class ArrayTest {
    public static void main(String[]args) {
        String[] str = {"Java ", "good", " language"} ;
        int[] num = new int[3] ;
        num[0] = 100;
        num[1] = 200;
        str[1] = "the best";
        System.out.println( "String array length: " + str.length );
        System.out.println( "Number array length: " + num.length );
        System.out.println( num[0] + "," + num[1] + "," + num[2] );
        System.out.println( str[0] + str[1] + str[2] );
    }
}