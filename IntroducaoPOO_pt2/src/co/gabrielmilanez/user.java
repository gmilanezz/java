package co.gabrielmilanez;

public class user {

    public String firstName;
    public String lastName;
    public String fullName;
    public Address address;

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
