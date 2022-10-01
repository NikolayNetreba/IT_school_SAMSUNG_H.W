import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 4){ 
            System.out.println(n + " Тортов");
        }
        else{  
            switch(n){

            case 1:
                System.out.println(n + " Торт");
                break;
            
            case 2:
            case 3:
            case 4:
                System.out.println(n + " Торта");        
                break;
            }
        }
    }
}
