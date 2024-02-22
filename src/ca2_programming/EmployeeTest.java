/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_programming;

import ca2_programming.CA2_Programming.employee;
import java.util.ArrayList;

/**
 *
 * @author Capitania
 */
public class EmployeeTest {
    public static void main (String[] args){
        CA2_Programming program = new CA2_Programming();
        
        ArrayList<CA2_Programming.employee> projectGroup = new ArrayList<>();
  

        CA2_Programming.employee emp1 = program.new employee("Joe Bloggs", "jb@gmail.com", CA2_Programming.getNextEmpNum());
        CA2_Programming.employee emp2 = program.new employee("Ann Banana", "ab@gmail.com", CA2_Programming.getNextEmpNum());
        CA2_Programming.employee emp3 = program.new employee("Tom Thumb", "tt@gmail.com", CA2_Programming.getNextEmpNum());
        
        projectGroup.add(emp1);
        projectGroup.add(emp2);
        projectGroup.add(emp3);
        
        int m = 0;
        System.out.println("Employees with an employee number above " + m + " are: " );
        for (CA2_Programming.employee emp :projectGroup){
            if (emp.getEmpNum()> m ){
                System.out.println(emp.getName());
            } else {
                System.out.println("There are no employees with a employee number that high" );
            }
        }
 
        
        System.out.println("Value of vaiable NextEmpNum: " + CA2_Programming.getNextEmpNum());
       
   
    }
    
}
