package co.gabrielmilanez;

public class app {

    public static void main(String[] args) {
        user[] users = new user[]{
                new user("Tiago", "Aguiar"),
                new user("Joao", "Silva"),
                new user("Flavia", "Silva")
        };

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}
