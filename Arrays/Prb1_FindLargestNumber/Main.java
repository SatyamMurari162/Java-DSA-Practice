package Arrays.Prb1_FindLargestNumber;

public class Main {
    public static void main(String[] args) {
        int arr [] = {1,30,59,68,79,57};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in array is : " +max);
    }
}