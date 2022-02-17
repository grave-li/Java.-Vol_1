import java.util.Arrays;

/**
 *Java 1. Homework #3.
 *
 * @author Grave Elizaveta
 * @version 16.02.2022
 *
 */

class MainArrays {
    public static void main(String[]args) {
        int[]arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[]arr2 = new int[100];
        int[]arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        
        

        numExchange(arr1);
        length100(arr2);
        multiply(arr3);
        diagonal();
        returnArray(4, 1);
    }

    static void numExchange(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void length100(int[] arr) {
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }


    static void multiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void diagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        //нашла способ вывести в консоль значение двумерного массива (Arrays.deepToString()), но он выводит в строчку. Можно ли вывестти значения в столбик?
        }
    }


    static void returnArray(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}

