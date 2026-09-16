package Arrays.Prb3_ReverseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        System.out.println("Before Reverse Array: " + Arrays.toString(arr));

        int i = 0, j = arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr [i] = arr[j];
            arr [j] = temp;
            i++;
            j--;
        }

        System.out.println("After Reverse Array: " + Arrays.toString(arr)); 
    }
}
