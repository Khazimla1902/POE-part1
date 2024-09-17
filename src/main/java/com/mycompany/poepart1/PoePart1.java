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
        String Username, firstName, lastName, Password;
        
        
        Scanner sc= new Scanner(System.in);
        //prompt the user
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
        
        }while(!second.checkPassword(Password));
        //calling my class
         second.Username(Username);
         second.checkPassword(Password);
         
        
        
        
        
        
        
    }
    
}
