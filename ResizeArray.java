package arrays;

public class ResizeArray {

    public void resizeArray(int[] arr) {
        int[] newArr = arr;

        arr = new int[12];

        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }
    }
}
