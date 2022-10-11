import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] arr = new String[2 * n + 1][2 * n + 1];
        arr[n][n] = "  0";
        int c = 1, last = 0, circleX = -1, circleY = 1, i = 1, count = 1;
        boolean FlagY = true, FlagX = false;
        while (c != (Math.pow((2 * n + 1),2) - 1)) {
            if(FlagY){
                arr[(n - circleY)][n] = " " *  + i;
                FlagY = false;
            } else if () {


            }

            ++i;
        }
    }
}
