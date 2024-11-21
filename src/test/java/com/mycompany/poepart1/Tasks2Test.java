/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author RC_Student_lab
 */
public class Tasks2Test {
    
    /**
     * Test of displayDoneTask method, of class Tasks2.
     */
    @Test
    public void testDisplayDoneTask() {
        System.out.println("displayDoneTask");
        Tasks2 instance = new Tasks2();
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");

        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Login");

        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Done");

        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(5);
        String expResult = "Developer: Mike Smith"
                + "\nTask Name : Create Login"
                + "\nDuration: 5"
                + "\nTask Status: Done";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));

        String result = instance.displayDoneTask(developerDetails, taskName, taskDuration, taskStatus);
        assertEquals(expResult, result);
       
        
    }

     public void testDisplayDoneTask2() {
        System.out.println("displayDoneTask");
        Tasks2 instance = new Tasks2();

        // data
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Edward Harrison");

        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Add Features");

        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Doing");

        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(8);

        // Expected result
        String expResult = "Developer: Edward Harrison"
                + "\nTask Name : Create Add Features"
                + "\nDuration: 8"
                + "\nTask Status: Doing";

        // Actual result
        String result = instance.displayDoneTask(developerDetails, taskName, taskDuration, taskStatus);

        // Assertion
        assertEquals(expResult, result);
        
        
       
        
    }
 public void testDisplayDoneTask3() {
        System.out.println("displayDoneTask");
        Tasks2 instance = new Tasks2();

        // Mock data
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Pualson");

        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Reports");

        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Done");

        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(2);

        // Expected result
        String expResult = "Developer: Samantha Pualson"
                + "\nTask Name : Create Reports"
                + "\nDuration: 2"
                + "\nTask Status: Done";

        // Actual result
        String result = instance.displayDoneTask(developerDetails, taskName, taskDuration, taskStatus);

        // Assertion
        assertEquals(expResult, result);
        
    }
  public void testDisplayDoneTask4() {
        System.out.println("displayDoneTask");
       Tasks2 instance = new Tasks2();

        // Mock data
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Oberholzer");

        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Add Arrays");

        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");

        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(11);

        // Expected result
        String expResult = "Developer: Glenda Oberholzer"
                + "\nTask Name : Add Arrays"
                + "\nDuration: 11"
                + "\nTask Status: To Do";
        

        // Actual result
        String result = instance.displayDoneTask(developerDetails, taskName, taskDuration, taskStatus);

        // Assertion
        assertEquals(expResult, result);
       
        
    }
    /**
     * Test of displayLongestTask method, of class Tasks.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(5);
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        String expResult="Developer: Mike Smith"
                + "Duration: 5 ";
        Tasks instance = new Tasks();
        String result = "";
        assertEquals(expResult,result );
        
    }
public void testDisplayLongestTask2() {
        System.out.println("displayLongestTask");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(8);
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Edward Harrison");
        String expResult="Developer: Edward Harrison"
                + "Duration: 8 ";
        Tasks instance = new Tasks();
        String result = "";
        assertEquals(expResult,result );
}
public void testDisplayLongestTask3() {
        System.out.println("displayLongestTask");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(2);
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Pualson");
        String expResult="Developer: Samantha Pualson"
                + "Duration: 2 ";
        Tasks instance = new Tasks();
        String result = "";
        assertEquals(expResult,result );
}
public void testDisplayLongestTask4() {
        System.out.println("displayLongestTask");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(11);
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Oberholzer");
        String expResult="Developer: Glenda Oberholzer"
                + "Duration: 11 ";
        Tasks instance = new Tasks();
        String result = "";
        assertEquals(expResult,result );
}


    /**
     * Test of searchByTaskName method, of class Tasks.
     */
    @Test
    public void testSearchByTaskName() {
        System.out.println("searchByTaskName");
        String searchName = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Login");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String result = "";
        String expResult= "Task Name: Create Login"
                + "\nDeveloper Details: Mike Smith "
                + "\nTask Status: To Do";
         assertEquals(expResult,result );
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testSearchByTaskName2() {
        System.out.println("searchByTaskName");
        String searchName = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Edward Harrison");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create New Features");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Doing");
        Tasks instance = new Tasks();
        String result = "";
        String expResult= "Task Name: Create Login"
                + "\nDeveloper Details: Mike Smith "
                + "\nTask Status: To Do";
         assertEquals(expResult,result );
        // TODO review the generated test code and remove the default call to fail.
        
    }
    public void testSearchByTaskName3() {
        System.out.println("searchByTaskName");
        String searchName = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Paulson");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Report");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String result = "";
        String expResult= "Task Name: Create Report"
                + "\nDeveloper Details: Samantha Paulson "
                + "\nTask Status: To Do";
         assertEquals(expResult,result );
        // TODO review the generated test code and remove the default call to fail.
        
    }
     public void testSearchByTaskName4() {
        System.out.println("searchByTaskName");
        String searchName = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Obelhozer");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Add Arrays");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String result = "";
        String expResult= "Task Name: Create Login"
                + "\nDeveloper Details: Mike Smith "
                + "\nTask Status: To Do";
         assertEquals(expResult,result );
        // TODO review the generated test code and remove the default call to fail.
        
    }


    /**
     * Test of searchByDeveloper method, of class Tasks.
     */
    @Test
    public void testSearchByDeveloper() {
        System.out.println("searchByDeveloper");
        String searchDev = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        ArrayList<String> taskName =new ArrayList<>();
        taskName.add("To create");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String expResult=" Developer details: Mike Smith"
                + "\nTask Name:To create "
                + "\nTask Status: To Do";
         String result = "";
        assertEquals(expResult,result );

        
    }
    public void testSearchByDeveloper2() {
        System.out.println("searchByDeveloper");
        String searchDev = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Edward Harrison");
        ArrayList<String> taskName =new ArrayList<>();
        taskName.add("Create Add Features");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String expResult=" Developer details: Edward Harrison "
                + "\nTask Name: Create Add Features"
                + "\nTask Status: Done";
         String result = "";
        assertEquals(expResult,result );

        
    }
    public void testSearchByDeveloper3() {
        System.out.println("searchByDeveloper");
        String searchDev = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Paulson");
        ArrayList<String> taskName =new ArrayList<>();
        taskName.add("Create Reports");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Done");
        Tasks instance = new Tasks();
        String expResult=" Developer details: Samantha Paulson"
                + "\nTask Name:Create Reports"
                + "\nTask Status:Done";
         String result = "";
        assertEquals(expResult,result );

        
    }
    public void testSearchByDeveloper4() {
        System.out.println("searchByDeveloper");
        String searchDev = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Obelholzer");
        ArrayList<String> taskName =new ArrayList<>();
        taskName.add("Add Arrays");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        Tasks instance = new Tasks();
        String expResult=" Developer details: Glenda Obelholzer "
                + "\nTask Name: Add Arrays"
                + "\nTask Status:To Do";
         String result = "";
        assertEquals(expResult,result );

        
    }

    /**
     * Test of displayAllTasks method, of class Tasks.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("To create");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(5);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name: To create "
                + "\nDeveloper Details: Mike Smith"
                + "\nTaskID:"
                + "\nTask Duration:5 ";
        instance.displayAllTasks(developerDetails, taskName, taskStatus, taskID, taskDuration);
         String result = "";
        assertEquals(expResult,result );
       
    }
    public void testDisplayAllTasks2() {
        System.out.println("displayAllTasks");
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("To create");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(5);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name: "
                + "\nDeveloper Details: "
                + "\nTaskID:"
                + "\nTask Duration: ";
        instance.displayAllTasks(developerDetails, taskName, taskStatus, taskID, taskDuration);
         String result = "";
        assertEquals(expResult,result );
       
    }
    public void testDisplayAllTasks3() {
        System.out.println("displayAllTasks");
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Paulson");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Reports");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Done");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(2);
        Tasks2 instance = new Tasks2();
        String expResult=
               "\nTask Name:Create Reports  "
                + "\nDeveloper Details:Samantha Paulson "
                + "\nTaskID:"
                + "\nTask Duration: ";
        instance.displayAllTasks(developerDetails, taskName, taskStatus, taskID, taskDuration);
         String result = "";
        assertEquals(expResult,result );
       
    }
    public void testDisplayAllTasks4() {
        System.out.println("displayAllTasks");
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Oberholzer");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Add Array");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(11);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name:Glend Oberlholzer "
                + "\nDeveloper Details:Add Array "
                + "\nTaskID:"
                + "\nTask Duration :11 ";
        instance.displayAllTasks(developerDetails, taskName, taskStatus, taskID, taskDuration);
         String result = "";
        assertEquals(expResult,result );
       
    }

    /**
     * Test of deleteTask method, of class Tasks.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String taskNameToDelete = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Mike Smith");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("To create");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(5);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name: To Create"
                + "\nDeveloper Details:Mike Smith"
                + "\nTaskID:"
                + "\nTask Duration :11 ";
        instance.deleteTask(taskNameToDelete, developerDetails, taskName, taskStatus, taskID, taskDuration);
        String result = "";
        assertEquals(expResult,result );
        
    }
     public void testDeleteTask2() {
        System.out.println("deleteTask");
        String taskNameToDelete = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Edward Harrison");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Add Features");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(8);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name:To Create Add features"
                + "\nDeveloper Details:Edward Harrison"
                + "\nTaskID:"
                + "\nTask Duration :8";
        instance.deleteTask(taskNameToDelete, developerDetails, taskName, taskStatus, taskID, taskDuration);
        String result = "";
        assertEquals(expResult,result );
        
    }
      public void testDeleteTask3() {
        System.out.println("deleteTask");
        String taskNameToDelete = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Samantha Paulson");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Create Reports");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("Done");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(2);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name:Create Reports"
                + "\nDeveloper Details: Samantha Paulson "
                + "\nTaskID:"
                + "\nTask Duration :2 ";
        instance.deleteTask(taskNameToDelete, developerDetails, taskName, taskStatus, taskID, taskDuration);
        String result = "";
        assertEquals(expResult,result );
        
    }
     public void testDeleteTask4() {
        System.out.println("deleteTask");
        String taskNameToDelete = "";
        ArrayList<String> developerDetails = new ArrayList<>();
        developerDetails.add("Glenda Oberholzer");
        ArrayList<String> taskName = new ArrayList<>();
        taskName.add("Add Arrays");
        ArrayList<String> taskStatus = new ArrayList<>();
        taskStatus.add("To Do");
        ArrayList<String> taskID = new ArrayList<>();
        taskID.add("");
        ArrayList<Integer> taskDuration = new ArrayList<>();
        taskDuration.add(11);
        Tasks2 instance = new Tasks2();
        String expResult="Task Name:Glenda Oberholzer"
                + "\nDeveloper Details:Add Array "
                + "\nTaskID:"
                + "\nTask Duration :11 ";
        instance.deleteTask(taskNameToDelete, developerDetails, taskName, taskStatus, taskID, taskDuration);
        String result = "";
        assertEquals(expResult,result );
        
    }
}