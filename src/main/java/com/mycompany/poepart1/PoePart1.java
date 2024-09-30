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

        //Declarations
        String Username, loginPass, loginUser, Password, lastName,firstName ;
        
        
        Scanner sc= new Scanner(System.in);
        //prompt the user while checking the requirements
        do{
        System.out.print("Please Enter Username: ");
        Username=sc.next();
        }while(second.Username(Username));
        
        System.out.print("Please enter First Name: ");
        firstName=sc.next();
        
        System.out.print("Please enter Last Name: ");
        lastName=sc.next();
        
        
        
        
        do{
       System.out.print("Please enter Password: ");
        Password=sc.next();
        }while(second.checkPassword(Password));
        
        
        
         //login to the acoount using the same details
         do{
        System.out.println("Please enter your Username: ");
        loginUser=sc.next();
       System.out.print("Please enter your Password: ");
        loginPass=sc.next();
        }while(second.loginUser(loginUser, loginPass, loginUser));
        
        
        
        
        
        
        
    }
    
}
