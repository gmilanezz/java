package co.gabrielmilanez;

public class app {

    public static void main(String[] args){
        int x = 0;
        user user00 = new user();
        user00.firstName = "gabriel";
        user00.lastName = "milanez";

        user user01 = new user();
        user01.firstName = "adriano";
        user01.lastName = "kleber";

        System.out.println(user00.firstName);
        System.out.println(user01.firstName);
    }
}
