package lt.baltictalents.lecture1;

import java.util.Arrays;

class ArraysMain {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[5]; // masyvo dydis: 5
        arr1[7] = 7; // kris klaida
        arr1[4] = 10; // maximalus indeksas
        arr1[0] = 1;
        arr1[2] = 2;
        System.out.println("arr1" + Arrays.toString(arr1));

        int[] arr2 = new int[7]; // masyvo dydis: 7
        System.out.println("arr2" + Arrays.toString(arr2));

        int[] arr3 = {1, 2, 3, 4};
        System.out.println("arr3" + Arrays.toString(arr3));

        int[] arr4 = new int[]{1, 2, 4};
        System.out.println("arr4" + Arrays.toString(arr4));
        System.out.println("arr4 size=" + arr4.length);
    }
}
