package co.gabrielmilanez;

import java.util.ArrayList;
import java.util.List;

public class app {

    public static void main(String[] args) {
        List<user> users = new ArrayList<>();

        int i = 0;
        while (i < 10) {
            user actual = new user("Nome " + i, "Sobrenome " + i);
            users.add(actual);
            i++;
        }

        System.out.println(users.get(9).getFirstName());
        System.out.println(users.get(9).getLastName());

        user user11 = new user("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());
    }
}
