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
    public int returnTaskDuration(int taskDuration) {
        return taskDuration;
    }
    //creating a new mehod for requirements
    public void addTasks() {
        
        
        String input = JOptionPane.showInputDialog("How many tasks would you like to add?");
        int numTasks=0;
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
    public void displayDoneTask(ArrayList<String> developerDetails ,ArrayList<String> taskName ,ArrayList<Integer> taskDuration , ArrayList<String> taskStatus) {
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
    public void displayLongestTask(ArrayList<Integer> taskDuration ,ArrayList<String> developerDetails) {
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
    public void searchByTaskName(String searchName,ArrayList<String> developerDetails,ArrayList<String> taskName,ArrayList<String> taskStatus ) {
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
     public  void searchByDeveloper(String searchDev,ArrayList<String> developerDetails,ArrayList<String> taskName,ArrayList<String> taskStatus ) {
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
     
     public void displayAllTasks(ArrayList<String> developerDetails, ArrayList<String> taskName, ArrayList<String> taskStatus, ArrayList<String> taskID, ArrayList<Integer> taskDuration) {
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
     public  void deleteTask(String taskNameToDelete,ArrayList<String> developerDetails,ArrayList<String> taskName,ArrayList<String> taskStatus,ArrayList<String> taskID,ArrayList<Integer> taskDuration  ) {
    
    for (int i = 0; i < taskName.size(); i++) {
        
        if (taskName.get(i).equalsIgnoreCase(taskNameToDelete)) {
            
            taskName.remove(i);
            taskID.remove(i);
            developerDetails.remove(i);
            taskDuration.remove(i);
            taskStatus.remove(i);
            
            
            JOptionPane.showMessageDialog(null, "Task deleted successfully ");
            return;  // Exit the method after successful deletion
        }
    }
    
    // If no task was found that matches the given task name
    JOptionPane.showMessageDialog(null, "Task not found!");
}
}
