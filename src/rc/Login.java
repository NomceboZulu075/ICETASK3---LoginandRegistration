/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author Nomcebo Zulu ST10452658
 */
public class Login {
    //Declare instance variables for the user's first and last name, their username and password
    private String firstName = "";
    private String lastName = "";
    private String username = "";
    private String password = "";
    
    //Create the getters - the accessor methods for the instance variables to return the attributes value
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    
    //Create the setters - the mutator methods for the instance variables to be set
    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setUsername (String username) {
        this.username = username;
    }
    public void setPassword (String password) {
        this.password = password;
    }
    
    
    
}
