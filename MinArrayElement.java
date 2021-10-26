package arrays;

import java.util.Scanner;

public class MinArrayElement {

    public Scanner sc = new Scanner(System.in);
    public int min = Integer.MAX_VALUE;

    public int[] readIntegers(int count) {
        //System.out.println("Enter nuber of elements: ");
        //count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at: " + (i + 1));
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public int findMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min value is: " + min);
        return min;
    }
}
