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
     public String registerUser(String Username , String regex)  {
         if(!checkUserName(Username)){
           return "Username is not correctly formatted, please ensure that your username contains an underscore is no more 5 characters in length";  
         }
         else if(!checkPasswordComplexity(regex)){
             return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a numberand a special character";
         }
         
         
         else{
         return "Username and password successfully registered";
         }
     }    
     public boolean loginUser(String Username, String pass , String storedUsername , String storedPassword){
         return Username.equals(storedUsername)&& pass.equals(storedPassword);
     }
     
     
     
     
     
     public String returnLoginStatus(boolean login){
       
         
         if(login){
             login= true;
             return "Welcome" +" "+ firstName+ "  " + lastName +", it is great to see you again";
         }else {
             return "Username or password incorrect, please try again.";
         }
         
     }
    
        
        
    
    
   
    
}

