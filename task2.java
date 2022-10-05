import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            long n = in.nextLong();
            long result = 0;
            while (Math.abs(n) > 0) {
                result *= 10;
                result += n % 10;
                n /= 10;
            }
            System.out.println(result);
        }
    }
}