package co.gabrielmilanez;

public class app {

    public static void main(String[] args){
        user user00 = new user();
        user00.setFirstName("gabriel");

        user user01 = new user();
        user01.setFirstName("julia");

        System.out.println(user00.getFirstName());

    }
}
