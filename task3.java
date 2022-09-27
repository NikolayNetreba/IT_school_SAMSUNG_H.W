import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a/100 + a % 10 + a / 10 % 10);
        System.out.println(a+((a + 1) % 2 + 1));
    }
}