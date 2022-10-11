import java.util.Scanner;


public class Task3 {
    public static void spiralFill(int[][] array) {
        int length = array.length, j, print = 0;
        for (int i = 0; i < length/2 + length%2; i++) {
            for (j = i; j < length - i; j++) {
                print++;
                array[i][j] = print;
            }
            for (j = i + 1; j < length - i; j++) {
                print++;
                array[j][length - 1 - i] = print;
            }
            for (j = i + 1; j < length - i; j++) {
                print++;
                array[length - 1 - i][length - 1 - j] = print;
            }
            for (j = i + 1; j < length - i - 1; j++) {
                print++;
                array[length - 1 - j][i] = print;
            }
        }
    }


    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (ints[j] / 100 > 0) {
                    System.out.print(ints[j] + " ");
                } else {
                    if (ints[j] / 10 > 0) {
                        System.out.print(" " + ints[j] + " ");
                    } else {
                        System.out.print("  " + ints[j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextShort();
        int[][] a = new int[n][n];
        spiralFill(a);
        printArray(a);
    }
}
// это не моё решение я не смог я просто захотел
// посмотреть и понять как это работает