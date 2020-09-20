package ru.ssau.tk.kkkonnova.practice;

public class Person {

    private String firstName;
    private String lastName;
    private int passportId;

    Person(){

    }

    Person(String myFirstName, String myLastName){
        firstName = myFirstName;
        lastName = myLastName;
    }

    Person(int myPassportId){
        passportId = myPassportId;
    }

    Person(String myFirstName, String myLastName, int myPassportId){
        firstName = myFirstName;
        lastName = myLastName;
        passportId = myPassportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }
}
