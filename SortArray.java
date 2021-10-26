package arrays;

import java.util.Scanner;

public class SortArray {

    static int[] arr;
    static int numInArr;

    static Scanner sc = new Scanner(System.in);

    private static int[] getIntegers() {
        System.out.println("Enter number elements of array:");
        numInArr = sc.nextInt();
        arr = new int[numInArr];
        for (int i = 0; i < numInArr; i++) {
            System.out.println("Enter " + (i) + " element: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static void printSortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    private static int[] sortIntegers() {
        int[] sortArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortArr.length; i++) {
                for (int j = i + 1; j < sortArr.length; j++) {
                    if (sortArr[i] < sortArr[i + 1]) {
                        temp = sortArr[i];
                        sortArr[i] = sortArr[i + 1];
                        sortArr[i + 1] = temp;
                        flag = true;
                    }
                }
            }
        }

        return sortArr;
    }

    public static int[] sortNiz() {
        int[] niz = {11, 2, 6, 7, 5, 9, 10, 4, 22, 33, 55, 78};
        int[] sortNiz = new int[niz.length];

        for (int i = 0; i < niz.length; i++) {
            sortNiz[i] = niz[i];
        }
        int temp = 0;

        for (int i = 0; i < sortNiz.length; i++) {
            for (int j = i + 1; j < sortNiz.length; j++) {
                if (sortNiz[i] > sortNiz[j]) {
                    temp = sortNiz[i];
                    sortNiz[i] = sortNiz[j];
                    sortNiz[j] = temp;
                }
            }
        }

        return sortNiz;
    }
}
