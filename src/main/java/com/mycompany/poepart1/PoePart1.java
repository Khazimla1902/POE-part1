/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {
    private static boolean loggedIn = false;
   private static ArrayList<Tasks> tasks = new ArrayList<>();
    private static int taskCounter = 0;

    public static void main(String[] args) {
    
        
    
    
   
        Tasks task = new Tasks();
        
        
               
       
        login second = new login();
       Scanner scanner = new Scanner(System.in);
        
        //Prompt for user details
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
        
    
        while (!loggedIn) {
            JOptionPane.showMessageDialog(null, "Please log in to continue.");
            
            
           loggedIn = true;
           
        second.Username= JOptionPane.showInputDialog(null, "Please Enter Username: ", args);
            second.Username =  scanner.next();
            second.pass = JOptionPane.showInputDialog(null, "Please enter Password", args);
            second.pass = scanner.next();
            
          }
        
            

        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        

        while (true) {
            String[] options = {"Add tasks", "Show report", "Quit"};
            int choice = JOptionPane.showOptionDialog(null, "Please choose an option:", "EasyKanban Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);
            
            switch (choice) {
                case 1 :
                    addTasks();
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
    private static void addTasks() {
        
        
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks=0;
        try {
            numTasks = Integer.parseInt(input);
                           
        Tasks task = new Tasks(); 
            
            for(int count= 0;count<numTasks;count++){
            
                

                
                  String taskName = JOptionPane.showInputDialog("Enter task name: ");
        int taskNumber=0;
         String taskDescription = JOptionPane.showInputDialog(null,"Enter task description: ");
         
        String developerDetails = JOptionPane.showInputDialog(null,"Please Enter Developer details ");
         
       int taskDuration=Integer.parseInt(JOptionPane.showInputDialog("Please enter duration"));
         
         
        
        
        
        
        if(!task.checkTaskDescription()){
            JOptionPane.showMessageDialog(null,"Please nter a task decription of less than 50 characters");
            return;
        }
        String taskID = task.createTaskID();
        JOptionPane.showMessageDialog(null, "Task ID: " + taskID);
        
        
        JOptionPane.showMessageDialog(null,task.printTaskDetails());
        
        task.taskStatus ="Done";
        JOptionPane.showMessageDialog(null,"Task Status" + task.taskStatus);
        
        
        
        
               task.example(input, taskCounter, input, input, taskCounter);
                
        }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
        }
        
        
    }
}
    
        
    
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 



