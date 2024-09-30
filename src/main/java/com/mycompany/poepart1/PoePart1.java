/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {

    public static void main(String[] args) {
    login second = new login();
    Scanner sc = new Scanner (System.in);
        String Username,pass, firstName, lastName , loginUser , loginPass  ;
        
        
        
        
        
        System.out.print("Please Create Username: ");
        Username=sc.next();
        
        
        
        System.out.print("Please Create Password: ");
        pass=sc.next();
       
       
        
        
        System.out.print("Please enter First Name : ");
        firstName=sc.next();
        
        System.out.print("Please enter last Name: ");
        lastName=sc.next();
        
        String registration = second.registerUser();
        System.out.print(registration);
        
        
         
        
          
        if(registration.equals("Username and password successfully registered")){
            System.out.println("Please Login to your account");
         
         
        System.out.println("Please enter your Username: ");
        loginUser=sc.next();
        System.out.print("Please enter your Password: ");
        loginPass=sc.next();
            
        }
        System.out.println(second.returnLoginStatus(Username, pass));
        
    }
    
                 
        
   
        
        
        
        
        
        
                
        
        
        
    
        
        
  
    
        
        

                       
    
 
    }


