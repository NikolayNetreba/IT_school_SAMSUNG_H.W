import java.util.Scanner;


public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();
        if (x < y && y < 2 - x * x)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}