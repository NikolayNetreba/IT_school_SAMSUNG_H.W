import java.util.Scanner;


public class task3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; ++i) array[i] = in.nextInt();
        int min = array[0];
        for(int i = 1; i < n; ++i){
            if(array[i] > 0 && array[i] < min || min < 0){
                min = array[i];
            }
        }
        System.out.println(min);
    }



    
}
