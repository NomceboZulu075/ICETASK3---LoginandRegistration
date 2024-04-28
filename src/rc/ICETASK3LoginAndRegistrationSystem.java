/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;
import javax.swing.JOptionPane;

/**
 *
 * @author Nomcebo Zulu ST10452658
 */
public class ICETASK3LoginAndRegistrationSystem {
    //Create an object for the Login class
    static Login objLogin = new Login();

    public static void main(String[] args) {
        //Prompting the user for user input
        
        objLogin.setFirstName(JOptionPane.showInputDialog("Please enter your first name:"));
        objLogin.setLastName(JOptionPane.showInputDialog("Please enter your last name:"));
        objLogin.setUsername(JOptionPane.showInputDialog("Enter your username:"));
        objLogin.setPassword(JOptionPane.showInputDialog("Enter your password:"));
        
        //Display message saying that username and password are successfully captured
        objLogin.getUsername();
        objLogin.getPassword();
        JOptionPane.showMessageDialog(null,"Username successfully captured!");
        JOptionPane.showMessageDialog(null, "Password successfully captured!");
        
        //Display welcome message
        String firstName = objLogin.getFirstName();
        String lastName = objLogin.getLastName();
        JOptionPane.showMessageDialog(null, "Welcome " + firstName + " " + lastName + ", it is great to see you again!");
        
        
        
    }
    
}
