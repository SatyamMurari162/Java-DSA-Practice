package Arrays.Prb2_FindSecondLargestNumber;

public class Main {
    public static void main(String[] args) {
        int [] arr = {30,30,5,6,7,10,15,20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest Number: " + secondLargest);
    }
}
