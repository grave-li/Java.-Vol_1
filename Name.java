import java.util.Arrays;

class Name {
    public static void main(String[]args) {
        int[] array = new int[5];
        array[0] = 9;
        array[1] = 8;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);
        System.out.println(array.length);
        int[] massiv = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(massiv.length);
        String[] seasons = new String[4];
        seasons[0] = "Winter"; 
        seasons[1] = "Spring"; 
        seasons[2] = "Summer"; 
        seasons[3] = "Autumn"; 
        System.out.println(Arrays.toString(seasons));
    }
}