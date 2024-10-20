/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {
    private static boolean loggedIn = false;
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int taskCounter = 0;

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
        
        
         // Login functionality
        while (!loggedIn) {
            JOptionPane.showMessageDialog(null, "Please log in to continue.");
            // Implement login logic here
            loggedIn = true; // For now, we'll assume login is always successful
        }

        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        while (true) {
            String[] options = {"Add tasks", "Show report", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Please choose an option:", "EasyKanban Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);
            
            switch (choice) {
                case 1 :
                    Tasks();
                    break;
                case 2 :
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 3 :
                    JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                    return;
                default:
                    return;
            }
        
        }
        
        
        
    }
    
}
    
        
    
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 



