/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.personaldetails;

/**
 *
 * @author user
 */
public class PersonalDetails {
    private String firstName;
    private String lastName;
    private String email;
    private String DoB;

    public PersonalDetails() {
    }

    public PersonalDetails(String firstName, String lastName, String email, String DoB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.DoB = DoB;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", DoB=" + DoB + '}';
    }
    
    
}
