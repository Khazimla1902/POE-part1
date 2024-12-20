/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;
import javax.swing. JDialog;
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
       
       final JDialog dialog = new JDialog();
       dialog.setAlwaysOnTop(loggedIn);
        
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
        String registrationResult = second.registerUser(second.Username, second.pass);
        System.out.println(registrationResult);

        // If registration is successful, attempt to login
        if (registrationResult.equals("Username and password successfully registered")) {
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            boolean loginSuccess = second.loginUser(loginUsername, loginPassword , second.storedUsername , second.pass);
            System.out.println(second.returnLoginStatus(loginSuccess));
            
             if(loginSuccess) {
        JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
        
       
    }
        
             else {
                //loginSuccess = true;
                JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                // creating a menu using switch and cases and it must show only when the user ha loggin successfully
                while (true) {
                    String[] options = {"Add tasks\n", "Show report\n", "Quit\n", "Display Done task\n", "Longest Task\n", "Search developer\n","Search Task Name\n", "Delete Tasks\n"};
                    int choice = JOptionPane.showOptionDialog(null, "Please choose an option:", "EasyKanban Menu",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                            null, options, options[0]);
                    
                    switch (choice) {
                        case 0 :
                            task.addTasks();
                            break;
                        case 1 :
                            
                            task.displayAllTasks(Tasks.developerDetails, Tasks.taskName, 
                                Tasks.taskStatus, Tasks.taskID, Tasks.taskDuration);
                            break;
                        case 2 :
                            JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                            return;
                        case 3:
                            
                            task.displayDoneTask(Tasks.developerDetails, Tasks.taskName, 
                                Tasks.taskDuration, Tasks.taskStatus);
                            break;
                        case 4:
                            task.displayLongestTask(Tasks.taskDuration, Tasks.developerDetails);
                            break;
                        case 5:
                            String devName= JOptionPane.showInputDialog("Enter developer name to search:");
                            task.searchByDeveloper(devName, Tasks.developerDetails, Tasks.taskName, 
                                Tasks.taskStatus);
                            break;
                        case 6:
                            String inputname=  JOptionPane.showInputDialog("Enter task name to search:");
                            task.searchByTaskName(inputname, Tasks.developerDetails, Tasks.taskName, 
                                Tasks.taskStatus);
                            break;
                        case 7:
                            String taskDel=JOptionPane.showInputDialog("Enter task name to delete:");
                            task.deleteTask(taskDel, Tasks.developerDetails, Tasks.taskName, 
                                Tasks.taskStatus, Tasks.taskID, Tasks.taskDuration);
                            break;
                        default:
                            return;
                            
                    }
                    dialog.dispose();
                }
                
            }
       }

        
      

       
        
        
        
        
    }
}




    
    
   
    
    
        
    
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 



