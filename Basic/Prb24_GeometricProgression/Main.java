package Basic.Prb24_GeometricProgression;

public class Main {
    public static void main(String[] args) {
        int a = 3;   
        int r = 2;
        int n = 6;

        int sum = a * (int)(Math.pow(r, n) - 1) / (r - 1);
        System.out.println("Sum of Gp is: " + sum);
    }
}
