public class escopo {

    public static void main(String[] args){
        // escopo de variáveis
        int x;
        if (true){
            x = 10; // variavel local
        } else {
            x = 2;
        }
        System.out.println(x);
    }
}