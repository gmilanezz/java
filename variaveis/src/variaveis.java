public class variaveis {
    public static void main(String[] args) {
        var teste = "ola";
        teste = "mundo"; // mudei o conteúdo da variável

        // tipos de variáveis:
        double num1 = 24.3; // double -> só serve pra numero fracionado
        int num2 = 24; // int -> só serve pra numero inteiro
        var texto = "texto"; // string -> serve só pra variável com conteúdo entre aspas, interpretado pelo computador como texto
        boolean verdadeiro_ou_falso = true; // boolean -> define uma variável como verdadeiro ou falso (true or false)

        System.out.println(teste);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(texto);
        System.out.println(verdadeiro_ou_falso);
    }
}