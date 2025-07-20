package co.gabrielmilanez;

public class user {

    // propriedades campo (ou atributos)
    private String firstName;
    private String lastName;

    // construtor
    public user() {
    }

    public user(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
}
