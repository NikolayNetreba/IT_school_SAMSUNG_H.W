import java.util.Scanner;

public class MyArrays {

    public static void avgOf4Digit(int[] arr){
        double al = 0, count = 0;
        for (int j : arr) {
            if (j % 10_000 / 1000 != 0) {
                al += j;
                count += 1.0;
            }
        }
        System.out.println( count != 0? al/count:"-1.00");
    }

    public static void minToBegin(int[] arr1) {
        int min = arr1[0];
        for(int i = 1; i < arr1.length ; ++i){
            if(min > arr1[i]) min = arr1[i];
        }
        System.out.print(min + " ");
        for (int j : arr1) {
            if (j != min) System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[in.nextInt()];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = in.nextInt();
        }


        int[] arr1 = new int[in.nextInt()];
        for(int i = 0; i < arr1.length; ++i){
            arr1[i] = in.nextInt();
        }
        minToBegin(arr1);
        avgOf4Digit(arr);
    }
}

