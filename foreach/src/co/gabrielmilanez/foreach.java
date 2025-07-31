package co.gabrielmilanez;

public class foreach {

    public static void main(String[] args){
        User userA = new User("Gabriel", "Milanez");
        System.out.println(userA.output());
        System.out.println(userA.output(false));
    }
}