package Pattern_Printing.Prb5_FloydsTriangle;

public class FloydsTriangle {
    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(value + " ");
                value++;
            }
            System.out.println();
        }
    }
}
