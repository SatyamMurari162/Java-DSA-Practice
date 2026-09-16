package Arrays.Prb4_MoveZeroes;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 3, 0, 12 };

        int i = 0, j = 0;
        while (i <= arr.length-1) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
