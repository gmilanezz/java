package co.gabrielmilanez;

public class app {

    public static void main(String[] args){
        user[] users = new user[10];

        for(int i = 0; i < users.length; i++) {
            user actual = new user();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Nome " + i);
            users[i] = actual;
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }
}
