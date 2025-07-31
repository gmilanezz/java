package co.gabrielmilanez;

public class HashCode {

    public static void main(String[] args){
        User userA = new User("Gabriel", "Milanez");
        User userB = new User("Gabriel", "Milanez");

        System.out.println(userA.hashCode());
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));
    }
}
