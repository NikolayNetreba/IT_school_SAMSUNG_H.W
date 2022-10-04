import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        String[] x1 = x.split("");
        for(int i = x1.length - 1; i >= 0; --i){
            if(x1[i] != "0" && i != x1.length - 1  )
                System.out.print(x1[i]);}



    }
}
