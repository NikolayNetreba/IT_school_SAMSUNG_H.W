import java.util.Scanner;

public class task2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dwarf = 11, wolf = 2, count = 0; 
        for (int i = 1; i <= n; ++i){
            if (dwarf < 19000000){    
                if (i % 2 != 0){
                    dwarf *= 3;
                }
            }
            if (count >= 70){
                wolf += 1;
                count = 0;
            }
            if (i % 2 == 0){
                while(wolf * 10 > dwarf){
                    wolf -= 1;}
                if (wolf * 10 <= dwarf){
                dwarf -= wolf * 10;
                count += wolf * 10;
                }
            }
        
        }
    System.out.printf("%s %s\n", dwarf, wolf);
    }
}
