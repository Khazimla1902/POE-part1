package com.mycompany.poepart1;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Tasks2 {
    static ArrayList<String> taskName = new ArrayList<>();
     static ArrayList<String> taskID = new ArrayList<>();
    static ArrayList<String> taskDescription = new ArrayList<>();
    static ArrayList<String> developerDetails = new ArrayList<>();
     static ArrayList<Integer> taskDuration = new ArrayList<>();
     static ArrayList<String> taskStatus = new ArrayList<>();
     
     
     // A method that display all tasks that are done
      public String displayDoneTask(ArrayList<String> developerDetails ,ArrayList<String> taskName ,ArrayList<Integer> taskDuration , ArrayList<String> taskStatus) {
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
        return null;
    }
      //A method that displays a task that has the longest duration
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
    //A method that searches Tasks by tasks Names
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
    //A method that searches tasks by developer
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
     //A method for the report of all tasks
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
     //A method to delete tasks
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

    int returnTaskDuration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


