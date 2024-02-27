/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2_programming;

import java.util.ArrayList;

/**
 *
 * @author Capitania
 */
public class CA2_Programming {
    
    private static int nextEmpNum = 1;

    
    public static class employee {
    
        private String name;
        private String email;
        private int empNum;
                
                    
    public employee() {
        this.name = "Niels Hoogenkamp";
        this.email = "n.hoogenkamp@gmail.com";     
        this.empNum = nextEmpNum++;
    }    

        
    public employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;     
    }      

    public String getName() {
        return name;
   
    }
    public void setName (String name){
        this.name= name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail (String email) {
        if (email.length ()> 3){
            this.email = email;
        } else{
            System.out.println("Email must be longer than 3 characters.");
        }
    }
    
    public int getEmpNum() {
        return empNum;
    }
    public void setEmpNum (int empNum){
        this.empNum = empNum;
    }
    }
    public static class manager extends employee {
        private String username;
        private String password;
    
    public manager(String name, String email, String username, String password){
        super (name, email);
        this.username = username; 
        this.password = password;
        this.setEmpNum(nextEmpNum++);
    }
        
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
  }
    public static int getNextEmpNum() {
        return nextEmpNum;
    }

}
    

