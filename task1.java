import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); 
        String n = in.nextLine();
        String[] num = str.split("") ;
        for(String s: num){
            if(s != n)
                System.out.println(s + "" + n);
        }
        
}
}
