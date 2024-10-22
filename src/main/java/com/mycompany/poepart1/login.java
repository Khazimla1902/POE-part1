package com.mycompany.poepart1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class login {
    
    
   String Username;
     String pass;
     String firstName;
     String lastName;
    String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&]).{8,}$";
    
    
    
    
    
    
    public boolean checkUserName(){
        return Username.contains("_")&& Username.length()<=5;
    }
    public boolean checkPasswordComplexity(){
        return pass.matches(regex);
        
    }
     public String registerUser()  {
         if(!checkUserName()){
           return "Username is not correctly formatted, please ensure that your username contains an underscore is no more 5 characters in length";  
         }
         if(!checkPasswordComplexity()){
             return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a numberand a special character";
         }
         
         
         return "Username and password successfully registered";
         
     }    public boolean loginUser(String storedUsername, String storedPassword){
         return storedUsername.equals(Username)&& storedPassword.equals(pass);
     }
     
     
     
     
     
     public String returnLoginStatus(String storedUsername, String storedPassword){
       
         
         if(loginUser(storedUsername, storedPassword)){
             return "Welcome" + firstName+ "  " + lastName +", it is great to see you again";
         }else {
             return "Username or password incorrect, please try again.";
         }
         
     }
    
        
        
    
    
   
    
}

