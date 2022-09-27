import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int count = 0;
        if (a % 5 == 0 && (a >= 100 & a <= 999))
            count++;
        if (b % 5 == 0 && (b >= 100 & b <= 999))
            count++;
        if (c % 5 == 0 && (c >= 100 & c <= 999))
            count++;
        if (count >= 2)
            System.out.println("True");
        else
            System.out.println("False");
    }
}