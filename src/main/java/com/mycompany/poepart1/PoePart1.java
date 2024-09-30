/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {

    public static void main(String[] args) {
    
    
        
        
        login second = new login();
        Scanner scanner = new Scanner(System.in);
        
        // Prompt for user details
        System.out.print("Please Create username: ");
        second.Username = scanner.nextLine();

        System.out.print("Please Create password: ");
        second.pass = scanner.nextLine();

        System.out.print("PLease Enter first name: ");
        second.firstName = scanner.nextLine();

        System.out.print("Please Enter last name: ");
        second.lastName = scanner.nextLine();

        // register the user
        String registrationResult = second.registerUser();
        System.out.println("Registration result: " + registrationResult);

        // If registration is successful, attempt to login
        if (registrationResult.equals("Username and password successfully registered")) {
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            boolean loginSuccess = second.loginUser(loginUsername, loginPassword);
            String loginStatus = second.returnLoginStatus(loginUsername, loginPassword);
            System.out.println("Login success: " + loginSuccess);
            System.out.println("Login status: " + loginStatus);
        }

        scanner.close();
    }
}
    
        
    
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 



