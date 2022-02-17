class Year {
    public static void main(String[] args) {
        int year;
        if (( year % 4 == 0 ) || ( year % 100 == 0 ) && ( year % 400 == 0 ));
            System.out.println(( year ) ? "not leap" : "Leap");
    }
}