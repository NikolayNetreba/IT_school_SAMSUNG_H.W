import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1, last = 1, summ = 0;
        while(n != 1){
            summ = count + last;
            last = count;
            count = summ;
            n -= 1;            
        }
        System.out.println(last);
    }
}
