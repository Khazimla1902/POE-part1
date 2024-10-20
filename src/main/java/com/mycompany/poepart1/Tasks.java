/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author RC_Student_lab
 */
class Tasks {
     private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    
    public Tasks(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskID = createTaskID();
        this.taskStatus = "To Do";
        
}
   //checking task description
public boolean checkTaskDescription(){
            return taskDescription.length() <= 50;
   }
// create and return the taskID
    public String createTaskID() {
        String taskNamePrefix = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String developerSuffix = developerDetails.length() >= 3 ? 
            developerDetails.substring(developerDetails.length() - 3).toUpperCase() : 
            developerDetails.toUpperCase();
        return taskNamePrefix + ":" + taskNumber + ":" + developerSuffix;
    }