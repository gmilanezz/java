package co.gabrielmilanez;

public class app {

    public static void main(String[] args){
        user user00 = new user();
        user00.firstName = "gabriel";
        user00.lastName = "milanez";
        String fullName = user00.getFullName();

        System.out.println(fullName);
    }
}
