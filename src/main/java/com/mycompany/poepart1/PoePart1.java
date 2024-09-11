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
        String Username, firstName, lastName;
        Scanner sc= new Scanner(System.in);
        //prompt the user
        System.out.println("Please Enter Username: ");
        Username=sc.next();
        System.out.println("Please enter First Name: ");
        firstName=sc.next();
        System.out.println("Please enter Last Name: ");
        lastName=sc.next();
       
        
        //Conditions and requirements
         
        if(Username.contains("_")&& Username.length()>5){
           System.out.println("Username Successfully caputured");
        }
        else{
            System.out.println("Username is not correctly formatted please ensure your username contains an underscore and is no more that 5 characters in length");
        }
        
        
        
    }
}
