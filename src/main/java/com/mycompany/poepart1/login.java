package com.mycompany.poepart1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class login {
    
    
    
    
        
        
    
    
    
    public boolean checkPassword(String pass){
        String regex="^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%#?&]).{8,}$";
       boolean check=false; 
       
       
       
       if(pass.matches(regex)){
           System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a numberand a special character");
           check=false;
       }
        else{
           System.out.println("Password successfully captured");
           check=true;
           
       }
        
        return check;
        
        
    } 
    public boolean Username(String user){
        boolean check=false;
        if(user.contains("_")&& user.length()<=5){
           System.out.println("Username Successfully caputured");
        }
        else{
            System.out.println("Username is not correctly formatted please ensure your username contains an underscore and is no more that 5 characters in length");
           
        }
        return check;
    }
    
    public boolean loginUser(){
        String Username="Asa_";
        String Password="@Kozangawe1";
        String text1="Welcome ";
        String text=" it is great to see you again"; 
        String FirstName="Khazimla ";
        String lastName=" Dalasile";
        boolean check=true;
                
        
        if(Username.equals("Asa_")&& Password.equals("@Kozangawe1")){                 
       System.out.print(text1 + FirstName + lastName + text);
        check=true;
        }
        else{
            System.out.print("Username or password incorrect, please try again");
        check=false;
        }
        return check;
        
        
    }
    
}

