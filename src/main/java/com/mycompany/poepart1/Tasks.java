/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
class Tasks {
    //declarations
     private static String [] taskName;
     private static int[] taskNumber;
     private static String [] taskDescription;
     private static String[] developerDetails;
     private static int[] taskDuration;
     private static String[] taskID;
    private static String[] taskStatus;
    
    // Arrays to store multiple tasks
    private static ArrayList<String> developers = new ArrayList<>();
    private static ArrayList<String> taskNames = new ArrayList<>();
    private static ArrayList<String> taskIDs = new ArrayList<>();
    private static ArrayList<Integer> taskDurations = new ArrayList<>();
    private static ArrayList<String> taskStatuses = new ArrayList<>();
   
   //checking task description
public boolean checkTaskDescription( String taskDescription){
            return taskDescription.length() <= 50;
          
              
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
     public String printTaskDetails(int details) {
        return "Task Status: " + taskStatus[details] + "\n" +
               "Developer Details: " + developerDetails[details] + "\n" +
               "Task Number: " + taskNumber[details] + "\n" +
               "Task Name: " + taskName[details] + "\n" +
               "Task Description: " + taskDescription[details] + "\n" +
               "Task ID: " + taskID[details] + "\n" +
               "Task Duration: " + taskDuration[details] + " hours";
    }

    // Method to return task duration
    public int returnTaskDuration(int taskDuration) {
        return taskDuration;
    }
    //creating a new mehod for requirements
    public void addTasks() {
        
        String [] choices = new String[]{"To Do", "Done","Doing"};
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks=0;
        try {
            numTasks = Integer.parseInt(input);
                           
        
            
            for(int count= 0;count<numTasks;count++){
           
                
          //Arrays and prompting          
        taskName = new String[numTasks];
        taskName[count]= JOptionPane.showInputDialog("Enter task name: "+ (count + 1)+ ":");
        
        taskNumber = new int[numTasks];
        taskNumber[count]=count;
        
        taskDescription = new String [numTasks];
        do{
        taskDescription[count] = JOptionPane.showInputDialog(null,"Enter task description: ");
        
        if(!checkTaskDescription(taskDescription[count])){
            JOptionPane.showMessageDialog(null,"Please enter a task decription of less than 50 characters");
           
        }
        else{
              JOptionPane.showMessageDialog(null,"Description has been captured");
              break;
            
        }
        
        }
        while(taskDescription[count].length() > 50);
         
         developerDetails = new String [numTasks];
        developerDetails[count] = JOptionPane.showInputDialog(null,"Please Enter Developer details ");
       
        taskDuration = new int[numTasks];
       taskDuration[count]=Integer.parseInt(JOptionPane.showInputDialog("Please enter duration: " + (count+1)+ ":"));
         //taskDuration[count]=0;
         
        
        taskID = new String[numTasks];
        taskID[count] =createTaskID(taskName[count],developerDetails[count],count);
        JOptionPane.showMessageDialog(null, "Task ID: " + taskID[count]);
        
        taskStatus = new String [numTasks];
        taskStatus[count] = (String)JOptionPane.showInputDialog(null,"Task Status: ","Choose a Status",JOptionPane.QUESTION_MESSAGE,null,choices ,choices[2]);
//        
               
           JOptionPane.showMessageDialog(null, "Task Details:\n"+ printTaskDetails(count));
               
                
        }
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
            
           
        }
       
}
}