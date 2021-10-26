package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MainArrays {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MinArrayElement m = new MinArrayElement();
        ReverseArray r = new ReverseArray();
        System.out.println("Enter number of elements: ");
        //sc.nextLine();
        int count = sc.nextInt();
        int[] array = m.readIntegers(count);
        System.out.println(Arrays.toString(array));
        m.findMin(array);
        r.reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

}
