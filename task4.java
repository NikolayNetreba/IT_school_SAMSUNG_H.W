import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mini = n % 10;
        while (n != 0){
            int last = n % 10;
            if (last < mini && last != 0)
                mini = last;
            n /= 10;
        }
        System.out.println(mini);
    }
}
