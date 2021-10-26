package arrays;

import java.util.Arrays;

public class CopyArray {

    public int[] copyArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i<array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        return sortedArray;
    }
}
