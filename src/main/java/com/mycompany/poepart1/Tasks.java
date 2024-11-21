/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

import static java.lang.Integer.sum;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class Tasks {
  
     static ArrayList<String> taskName = new ArrayList<>();
     static ArrayList<String> taskID = new ArrayList<>();
    static ArrayList<String> taskDescription = new ArrayList<>();
    static ArrayList<String> developerDetails = new ArrayList<>();
     static ArrayList<Integer> taskDuration = new ArrayList<>();
     static ArrayList<String> taskStatus = new ArrayList<>();
    private static final String[] choices = {"To Do", "Done", "Doing"};
    
    
     
   
   //checking task description
public boolean checkTaskDescription( String taskDescription){
            return taskDescription.length() <= 50;//this method must return a task decription that is less than 50
          
              
   }
// create and return the taskID
    public String createTaskID(String taskName, String developerDetails, int taskNumber) {
        String taskNamePrefix = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerSuffix = developerDetails.length() >= 3 ? 
            developerDetails.substring(developerDetails.length() - 3).toUpperCase() : 
            developerDetails.toUpperCase();
        return taskNamePrefix + ":" + taskNumber + ":" + developerSuffix;
    }
    // display print details
     public String printTaskDetails(int index) {
        return "Task Status: " + taskStatus.get(index) + "\n" +
               "Developer Details: " + developerDetails.get(index) + "\n" +
               "Task Number: " + (index + 1) + "\n" +
               "Task Name: " + taskName.get(index) + "\n" +
               "Task Description: " + taskDescription.get(index) + "\n" +
               "Task ID: " + taskID.get(index) + "\n" +
               "Task Duration: " + taskDuration.get(index) + " hours";
    }

    // Method to return task duration
    public int returnTaskDuration(ArrayList<Integer> taskDuration) {
        return taskDuration.get(taskDuration.size() - 1);

    }
    //creating a new mehod for requirements
    public void addTasks() {
        
        
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks=0;
        int sum =0;
        try {
            numTasks = Integer.parseInt(input); 
            for(int count= 0;count<numTasks;count++){
             
          //Arrays and prompting          
        
        String Input= JOptionPane.showInputDialog("Enter task name: "+ (count + 1)+ ":");
         taskName.add(Input);//The user is prompted to enter a task name, and the input is added to the taskName ArrayList.
        
        
        int taskNumber = count + 1;
       String taskDescriptionInput;
                do {
                    taskDescriptionInput = JOptionPane.showInputDialog("Enter task description for task " + (count + 1) + ":");
                    if (!checkTaskDescription(taskDescriptionInput)) {
                        JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Description has been captured.");
                        break;
                    }
                } while (taskDescriptionInput.length() > 50);

                taskDescription.add(taskDescriptionInput);//The user is prompted to enter a task description, which is validated to ensure it's no longer than 50 character then it's added to the taskDescription ArrayList.
         
        
          // Prompt for developer details
                String developerDetailsInput = JOptionPane.showInputDialog("Please enter developer details for task " + (count + 1) + ":");
                developerDetails.add(developerDetailsInput);
                

                // Prompt for task duration
                int taskDurationInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter task duration (in hours) for task " + (count + 1) + ":"));
                taskDuration.add(taskDurationInput);
                sum += returnTaskDuration( taskDuration);

                // Generate and display task ID
                String taskIDInput = createTaskID(Input, developerDetailsInput, taskNumber);
                taskID.add(taskIDInput);
                JOptionPane.showMessageDialog(null, "Task ID: " + taskIDInput);

                // Prompt for task status
                String taskStatusInput = (String) JOptionPane.showInputDialog(null, "Task Status: ", "Choose a Status",
                        JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
                taskStatus.add(taskStatusInput);

                // Display task details
                JOptionPane.showMessageDialog(null, "Task Details:\n" + printTaskDetails(count));
                 JOptionPane.showMessageDialog(null, "Total Hours Of All Tasks: " + sum + " hours");
            }

               
          
               
                
        
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
            
           
        }
        
       
}
    int returnTaskDuration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
