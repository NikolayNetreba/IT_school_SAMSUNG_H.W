import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; count2 < n * m; count2++, count1++) {
            if (count2 != 0 && count2 % m == 0) {
                i++;
                count1 = 0;
            }
            a[i][count1] = i * count1;
        }
    }
}

