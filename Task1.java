import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = 0, k = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; k < n * m; k++, j++) {
            if (k != 0 && k % m == 0) {
                i++;
                j = 0;
            }
            a[i][j] = i * j;
        }
    }
}

