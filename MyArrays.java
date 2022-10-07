import java.util.Scanner;

public class MyArrays {
    public static void avgOf4Digit(int[] arr){
        double al = 0;
        double count = 0;
        for (int j : arr) {
            if (j % 10_000 / 1000 != 0) {
                al += j;
                count += 1.0;
            }
        }
        System.out.println( count != 0? al/count:"-1.00");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = in.nextInt();
        }
        avgOf4Digit(arr);
    }
}
