package co.gabrielmilanez.VisibilidadeEscopo;

public class app {

    // padrao (default)
    // public (visibilidade publica para todos os pacotes)
    // private (privado só pra classe atual)

    private static int x; // profº não explicou sobre, falou que é sobre POO

    public static void main(String[] args){
        // visibilidade de escopo!
    }

    public static void sum(int a, int b){
        System.out.println(x);
    }
}
