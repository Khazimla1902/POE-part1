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
    
    Scanner sc = new Scanner (System.in);
        login user = new login();
        
        // Set user details
        user.Username = "john_";
        user.pass = "P@ssw0rd";
        user.firstName = "John";
        user.lastName = "Doe";

        // Attempt to register the user
        String registrationResult = user.registerUser();
        System.out.println("Registration result: " + registrationResult);

        // Attempt to login
        boolean loginSuccess = user.loginUser("john_", "P@ssw0rd");
        String loginStatus = user.returnLoginStatus("john_", "P@ssw0rd");
        System.out.println("Login success: " + loginSuccess);
        System.out.println("Login status: " + loginStatus);
    }
        
    }
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 



