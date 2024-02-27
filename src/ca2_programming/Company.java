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
    private ArrayList<CA2_Programming.employee> staff;
    
    public Company () {
        this.companyName = "FX Buckley";
        this.staff = new ArrayList<>();     
    }
        
    public Company (String companyName) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();     
    }       
    
    public void addNewStaff(CA2_Programming.employee emp){
        staff.add(emp);
    }
    
    public int getStaffNumber() {
        return staff.size();
    }

           
    public void listEmployees (int empNumThreshold){
        System.out.println("Employees with an empNum above "+ empNumThreshold + ":");
        Iterator<CA2_Programming.employee> iterator = staff.iterator();        
        while (iterator.hasNext()){
            CA2_Programming.employee emp = iterator.next();
            if (emp.getEmpNum()> empNumThreshold) {
                System.out.println(emp.getName());
            }
     
        }


    }
    
    }
