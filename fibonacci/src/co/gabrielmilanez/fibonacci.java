package co.gabrielmilanez;
import java.util.Scanner;

public class fibonnacci {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int f1 = 0;
        int f2 = 1;

        int limite = input.nextInt();

        while(f2 < limite){
            int fn = f1+ f2;
            if (fn > limite)
                break;
            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }
    }
}
