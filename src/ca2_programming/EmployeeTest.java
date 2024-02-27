/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_programming;

import ca2_programming.CA2_Programming.employee;

/**
 *
 * @author Capitania
 */
public class EmployeeTest {
    public static void main (String[] args){
        employee emp1 = new employee ("Joe Bloggs" , "jb@gmail.com");
        employee emp2 = new employee ("Ann Banana" , "ab@gmail.com");
        employee emp3 = new employee ("Tom Thumb" , "tt@gmail.com");
        
        employee[] projectGroup = {emp1, emp2, emp3}; 
            
        int m = 0;
        System.out.println("Employees with an employee number above " + m + " are: " );
        for (CA2_Programming.employee emp :projectGroup){
            if (emp.getEmpNum()> m ){
                System.out.println(emp.getName());
            } else {
                System.out.println("There are no employees with a employee number that high" );
            }
        }    
        CA2_Programming.manager mgr1 = new CA2_Programming.manager("John Doe", "john.doe@example.com", "johnny", "password1");
        CA2_Programming.manager mgr2 = new CA2_Programming.manager("Alice Smith", "alice.smith@example.com", "alice", "password2");
        CA2_Programming.manager mgr3 = new CA2_Programming.manager("Bob Johnson", "bob.johnson@example.com", "bobby", "password3");
        CA2_Programming.manager mgr4 = new CA2_Programming.manager("Emily Davis", "emily.davis@example.com", "emily", "password4");
        CA2_Programming.manager mgr5 = new CA2_Programming.manager("Michael Brown", "michael.brown@example.com", "mike", "password5");

        CA2_Programming.manager[] managers = { mgr1, mgr2, mgr3, mgr4, mgr5 };

        System.out.println("Managers:");
        for (CA2_Programming.manager mgr : managers) {
            System.out.println("Name: " + mgr.getName() + ", Email: " + mgr.getEmail() + ",mgrNum: "+ mgr.getEmpNum() + " Username: " + mgr.getUsername() + ", Password: " + mgr.getPassword());
        }
    }
}
