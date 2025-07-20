package co.gabrielmilanez;

public class user {

    public String firstName;
    public String lastName;

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    // getter
    public String getFirstName(){
        return firstName;
    }
}
