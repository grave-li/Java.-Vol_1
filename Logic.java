class Logic {
    public static void main(String[]args) {
        boolean yes = true ;
        boolean no = false ;
        System.out.println("If yes and yes: " + (yes && yes)) ;
        System.out.println("If yes and no: " + (yes && no)) ;
        System.out.println("If yes or yes: " + (yes || yes)) ;
        System.out.println("If yes or no: " + (yes || no)) ;
        System.out.println("If no or no: " + (no || no)) ;
        System.out.println("First meanted result of yes: " + yes) ;
        System.out.println("First meanted result of no: " + no);
    }
                    
}