import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args){

        // tipos primitivos

        boolean isLogged = true;
        byte b = 'a';
        char c = 'c';
        short s  = -55;
        int i = 1231212;
        long l = 1234567890; // = int (só que com mais espacos)
        float f = 19.19f; // numero quebrado
        double d = 19.19; // aguenta 64bit

        // tipos nao primitivos:
        String character = "ab";

        // casting (conversao de tipos primitivos)

        double x = 10.10;
        short ss = 32;

        // primeiro casting visto: float:
        float ff = (float) x / ss;
        System.out.println(ff);

        // segundo casting visto: via Scanner
        Scanner scanner = new Scanner(System.in);
        int z = (int) scanner.nextDouble();

        System.out.println(z);
    }
}
