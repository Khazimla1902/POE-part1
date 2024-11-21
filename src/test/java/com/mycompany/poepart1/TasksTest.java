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
public class TasksTest {
    
   /**
     * Test of checkTaskDescription method, of class Tasks.
     */
    @Test
    public void testCheckTaskDescription1() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create login to authenticate users";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
public void testCheckTaskDescription2() {
        System.out.println("checkTaskDescription");
        String taskDescription = "Create login to authenticate users";
        Tasks instance = new Tasks();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    /**
     * Test of createTaskID method, of class Tasks.
     */
    @Test
    public void testCreateTaskID1() {
        System.out.println("createTaskID");
        String taskName="Login Feature";
        String developerDetails="Robyn Harrison";
          int taskNumber = 0;
        Tasks instance = new Tasks();
        String expResult = "LO:0:SON";
        String result = instance.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     public void testCreateTaskID2() {
        System.out.println("createTaskID");
        String taskName="Login Feature";
        String developerDetails="Mike Smith";
          int taskNumber = 0;
        Tasks instance = new Tasks();
        String expResult = "LO:0:SON";
        String result =instance.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**

    /**
     * Test of printTaskDetails method, of class Tasks.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int details = 0;
        Tasks instance = new Tasks();
        String expResult = "Task Status: To Do\n"
                + "Developer details: Robyn Harrison\n"
                + "Task Number: 0\n"
                + "Task Name: login Feature\n"
        + "Task ID:LO:0:son\n"
                + "Task Duration: 6 HOURS";
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    public void testPrintTaskDetails2() {
        System.out.println("printTaskDetails");
        int details = 0;
        Tasks instance = new Tasks();
        String expResult = "Task Status: To Do\n"
                + "Developer details: Robyn Harrison\n"
                + "Task Number: 0\n"
                + "Task Name: login Feature\n"
        + "Task ID:LO:0:son\n"
                + "Task Duration: 6 HOURS";
        String result = instance.printTaskDetails(details);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnTaskDuration method, of class Tasks.
     */
    @Test
    public void testReturnTaskDuration() {
        System.out.println("returnTaskDuration");
        int taskDuration = 8;
        Tasks instance = new Tasks();
        int expResult = 8;
        int result = instance.returnTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     public void testReturnTaskDuration2() {
        System.out.println("returnTaskDuration");
        int taskDuration = 10;
        Tasks instance = new Tasks();
        int expResult = 10;
        int result = instance.returnTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addTasks method, of class Tasks.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        Tasks instance = new Tasks();
        instance.addTasks();
        
    }


    /**
     * Test of displayDoneTask method, of class Tasks.
     */
    
}
