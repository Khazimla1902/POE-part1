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
     //private static String [] taskName;
     //private static int[] taskNumber;
     //private static String [] taskDescription;
     //private static String[] developerDetails;
     //private static int[] taskDuration;
     //private static String[] taskID;
    //private static String[] taskStatus;
     
    
    
    private static ArrayList<String> taskName = new ArrayList<>();
    private static ArrayList<String> taskID = new ArrayList<>();
    private static ArrayList<String> taskDescription = new ArrayList<>();
    private static ArrayList<String> developerDetails = new ArrayList<>();
    private static ArrayList<Integer> taskDuration = new ArrayList<>();
    private static ArrayList<String> taskStatus = new ArrayList<>();

    private static final String[] choices = {"To Do", "Done", "Doing"};
    
    
     
   
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
    public int returnTaskDuration(int taskDuration) {
        return taskDuration;
    }
    //creating a new mehod for requirements
    public void addTasks() {
        
        //String [] choices = new String[]{"To Do", "Done","Doing"};
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks=0;
        try {
            numTasks = Integer.parseInt(input);
            
            
            
     
        
            
            for(int count= 0;count<numTasks;count++){
           
                
          //Arrays and prompting          
        
        String Input= JOptionPane.showInputDialog("Enter task name: "+ (count + 1)+ ":");
         taskName.add(Input);
        
        
        int taskNumber = count + 1;
        
        
        
       // do{
        //taskDescription[count] = JOptionPane.showInputDialog(null,"Enter task description: ");
        
       // if(!checkTaskDescription(taskDescription[count])){
            //JOptionPane.showMessageDialog(null,"Please enter a task decription of less than 50 characters");
           
        //}
        //else{
             // JOptionPane.showMessageDialog(null,"Description has been captured");
              //break;
            
        //}
        
        //}
        //while(taskDescription[count].length() > 50);
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

                taskDescription.add(taskDescriptionInput);
         
         
        //developerDetails[count] = JOptionPane.showInputDialog(null,"Please Enter Developer details ");
       
        //taskDuration = new int[numTasks];
       //taskDuration[count]=Integer.parseInt(JOptionPane.showInputDialog("Please enter duration: " + (count+1)+ ":"));
         //taskDuration[count]=0;
         
        
        
        //taskID[count] =createTaskID(taskName[count],developerDetails[count],count);
        //JOptionPane.showMessageDialog(null, "Task ID: " + taskID[count]);
        
        
        //taskStatus[count] = (String)JOptionPane.showInputDialog(null,"Task Status: ","Choose a Status",JOptionPane.QUESTION_MESSAGE,null,choices ,choices[2]);
          // Prompt for developer details
                String developerDetailsInput = JOptionPane.showInputDialog("Please enter developer details for task " + (count + 1) + ":");
                developerDetails.add(developerDetailsInput);

                // Prompt for task duration
                int taskDurationInput = Integer.parseInt(JOptionPane.showInputDialog("Please enter task duration (in hours) for task " + (count + 1) + ":"));
                taskDuration.add(taskDurationInput);

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
            }

               
          
               
                
        
            
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            return;
            
           
        }
        
       
}
    public static void displayDoneTask() {
        StringBuilder output = new StringBuilder("Completed Tasks:\n\n");
        for (int i = 0; i < taskStatus.size(); i++) {
            if (taskStatus.get(i).equalsIgnoreCase("Done")) {
                output.append("Developer: ").append(developerDetails.get(i))
                      .append("\nTask Name: ").append(taskName.get(i))
                      .append("\nDuration: ").append(taskDuration.get(i))
                      .append(" hours\n\n");
            }
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
    public static void displayLongestTask() {
        int maxDuration = 0;
        int maxIndex = 0;
        
        for (int i = 0; i < taskDuration.size(); i++) {
            if (taskDuration.get(i) > maxDuration) {
                maxDuration = taskDuration.get(i);
                maxIndex = i;
            }
                    }
        
        String output = "Task with Longest Duration:\n" +
                       "Developer: " + developerDetails.get(maxIndex) + "\n" +
                       "Duration: " + maxDuration + " hours";
        JOptionPane.showMessageDialog(null, output);
        
    }
    public static void searchByTaskName(String searchName) {
        for (int i = 0; i < taskName.size(); i++) {
            if (taskName.get(i).equalsIgnoreCase(searchName)) {
                String output = "Task Found:\n" +
                              "Task Name: " + taskName.get(i) + "\n" +
                              "Developer: " + developerDetails.get(i) + "\n" +
                              "Status: " + taskStatus.get(i);
                JOptionPane.showMessageDialog(null, output);
                return;
            }
        }
          JOptionPane.showMessageDialog(null, "Task not found!");
    }
     public static void searchByDeveloper(String searchDev) {
        StringBuilder output = new StringBuilder("Tasks for developer " + searchDev + ":\n\n");
        boolean found = false;
        
        for (int i = 0; i < developerDetails.size(); i++) {
            if (developerDetails.get(i).equalsIgnoreCase(searchDev)) {
                output.append("Task Name: ").append(taskName.get(i))
                      .append("\nStatus: ").append(taskStatus.get(i))
                      .append("\n\n");
                found = true;
            }
        }
        
        if (!found) {
            JOptionPane.showMessageDialog(null, "No tasks found for this developer!");
        } else {
            JOptionPane.showMessageDialog(null, output.toString());
        }
    }
     
     public static void displayAllTasks() {
        StringBuilder report = new StringBuilder("Full Task Report:\n\n");
        
        for (int i = 0; i < taskName.size(); i++) {
            report.append("Task #").append(i + 1).append("\n")
                  .append("Task Name: ").append(taskName.get(i)).append("\n")
                  .append("Developer: ").append(developerDetails.get(i)).append("\n")
                  .append("Task ID: ").append(taskID.get(i)).append("\n")
                  .append("Duration: ").append(taskDuration.get(i)).append(" hours\n")
                  .append("Status: ").append(taskStatus.get(i)).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null, report.toString());
    }
     public static void deleteTask(String taskNameToDelete) {
    // Iterate through the list of task names to find the task
    for (int i = 0; i < taskName.size(); i++) {
        // If task name matches (case insensitive), delete the task
        if (taskName.get(i).equalsIgnoreCase(taskNameToDelete)) {
            // Remove the task details from all the associated ArrayLists
            taskName.remove(i);
            taskID.remove(i);
            developerDetails.remove(i);
            taskDuration.remove(i);
            taskStatus.remove(i);
            
            // Notify the user that the task has been deleted successfully
            JOptionPane.showMessageDialog(null, "Task deleted successfully ");
            return;  // Exit the method after successful deletion
        }
    }
    
    // If no task was found that matches the given task name
    JOptionPane.showMessageDialog(null, "Task not found!");
}
}
