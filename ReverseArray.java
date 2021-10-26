package arrays;

import java.util.Arrays;

public class ReverseArray {

    public void reverseArray(int[] arr) {
        int maxIndex=arr.length-1;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[maxIndex - i];
            arr[maxIndex - i] = temp;
        }
    }
}
