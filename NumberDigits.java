import java.util.Scanner;

public class NumberDigits {
    public static void SumOfSeven(int a, int b){
        int sum = 0, n;
        for(int i = a; i < b + 1; ++i){
            if(i % 7 == 0 && (i % 100 / 10 != 0)){
                n = i;
                while(n != 0){
                    int last = n % 10;
                    sum += last;
                    n /= 10;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        SumOfSeven(a, b);



    }
}
