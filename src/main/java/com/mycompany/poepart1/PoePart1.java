/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class PoePart1 {

    public static void main(String[] args) {
        //Declarations
        String Username, firstName, lastName, Password;
        Scanner sc= new Scanner(System.in);
        //prompt the user
        System.out.print("Please Enter Username: ");
        Username=sc.next();
        System.out.print("Please enter First Name: ");
        firstName=sc.next();
        System.out.print("Please enter Last Name: ");
        lastName=sc.next();
       System.out.print("Please enter Password: ");
        Password=sc.next();
        //Conditions and requirements
         
        if(Username.contains("_")&& Username.length()<5){
           System.out.println("Username Successfully caputured");
        }
        else{
            System.out.println("Username is not correctly formatted please ensure your username contains an underscore and is no more that 5 characters in length");
        }
        
        if(Password.length() > 8 && Password.matches(".[A-Z].")){
            System.out.println("Password successfully captured");
        }
        else{
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a numberand a special character");
        }
        
        
    }
}
