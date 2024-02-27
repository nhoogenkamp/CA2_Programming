/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_programming;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Capitania
 */

public class Company {
    private String companyName;
    ArrayList<CA2_Programming.employee> staff = new ArrayList<>();
    
    public Company (String companyName, ArrayList <CA2_Programming.employee> staff ) {
        this.companyName = companyName;
        this.staff = staff;     
    }
        
    public Company (String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();     
    }       
    
    public void addNewStaff(CA2_Programming.employee emp){
        staff.add(emp);
    }

           
    public void listEmployees (int empNumThreshold){
        System.out.println("Employees with an empNum above "+ empNumThreshold + ":");
        Iterator <CA2_Programming.employee> iterator = staff.iterator();
        int index = 0; 
        while (iterator.hasNext()){
            CA2_Programming.employee emp = iterator.next();
            System.out.println("Index " + index + ": " + emp.getName());
            if (emp.getEmpNum()> empNumThreshold) {
                System.out.println(emp.getName());
            }
            index++;
        }
    }
        
    public int getStaffNumber() {
        return staff.size();
    }
    public ArrayList<CA2_Programming.employee> getStaff(){
        return staff;
    }
    public String getCompanyName(){
        return companyName;
    }

     
    
}
