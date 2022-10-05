import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int str = in.nextInt(); 
            int n = in.nextInt();
            int result = 0;
            int count = 1;
            while(str > 0){
                int last = str % 10;
                str /= 10;
                if(n == last) continue;
                result += last * count;
                count *= 10;
                

            }
            System.out.println(result);
        }    
}
}
