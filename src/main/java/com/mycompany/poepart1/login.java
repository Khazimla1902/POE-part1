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
    
    String storedUsername;
    String storedPassword;
   String Username;
     String pass;
     String firstName;
     String lastName;
    String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&]).{8,}$";
    
    
    
    
    
    
    public boolean checkUserName(String Username){
        return Username.contains("_")&& Username.length()<=5;
    }
    public boolean checkPasswordComplexity( String regex){
        return pass.matches(regex);
        
    }
     public String registerUser(String Username , String pass , String firstName, String lastName)  {
         if(checkUserName(Username)&& checkPasswordComplexity(regex)){
             this.storedUsername = Username;
             this.storedPassword= pass;
             this.firstName = firstName;
             this.lastName= lastName;
             return "Username and password successfully registered";
             
         }else{
         }
         
         
        if (!checkUserName(Username)){
           return "Username is not correctly formatted, please ensure that your username contains an underscore is no more 5 characters in length";  
         }
          if(!checkPasswordComplexity(regex)){
             return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a numberand a special character";
         }
         
         return "Registration Failed, please try again";
         
     }    
     public boolean loginUser(String Username, String pass){
         return Username.equals(storedUsername)&& pass.equals(storedPassword);
     }
     
     
     
     
     
     public String returnLoginStatus(boolean login){
       
         
         if(login){
           
             return "Welcome" +" "+ firstName+ "  " + lastName +", it is great to see you again";
         }
         return null;
     }
    
        
        
    
    
   
    
}

