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
 
        
        System.out.println("Value of variable NextEmpNum: " + CA2_Programming.getNextEmpNum());
       
   
    }
    
}
