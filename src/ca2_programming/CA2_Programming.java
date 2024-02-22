/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca2_programming;

/**
 *
 * @author Capitania
 */
public class CA2_Programming {
    
    private static int nextEmpNum = 1;

    
    public class employee {
    
        private String name;
        private String email;
        private int empNum;

      public employee(String name, String email, int empNum) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
      
    
    public employee() {
        this.name = "Niels Hoogenkamp";
        this.email = "n.hoogenkamp@gmail.com";          
    }    
    

    public void setEmail (String email) {
        if (email.length ()> 3){
            this.email = email;
        } else{
            System.out.println("Email must be longer than 3 characters.");
        }
    }
    

    public String getName() {
        return name;
        
    }
    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return nextEmpNum;
    }
    }
    
    public static int getNextEmpNum() {
        return nextEmpNum++;
    }
}

    

