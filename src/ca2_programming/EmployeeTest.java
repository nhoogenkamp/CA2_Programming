/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_programming;

/**
 *
 * @author Capitania
 */
public class EmployeeTest {
    public static void main (String[] args){
        CA2_Programming program = new CA2_Programming();

        CA2_Programming.employee emp1 = program.new employee("Joe Bloggs", "jb@gmail.com", CA2_Programming.getNextEmpNum());
        CA2_Programming.employee emp2 = program.new employee("Ann Banana", "ab@gmail.com", CA2_Programming.getNextEmpNum());
        CA2_Programming.employee emp3 = program.new employee("Tom Thumb", "tt@gmail.com", CA2_Programming.getNextEmpNum());

    }
    
}
