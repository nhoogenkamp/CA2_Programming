/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2_programming;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Capitania
 */
public class ManagerConsole {
    private static final String manager_username = "Gnomeo";
    private static final String manager_password = "smurf";
    
    public static void login (Scanner scanner, ArrayList<CA2_Programming.employee>staff, CA2_Programming.employee[] projectGroup) {
        boolean loginCheck = false;
        
        while (!loginCheck) {
            System.out.println("Username: ");
            String Username = scanner.nextLine();
            System.out.println("Password: ");
            String Password = scanner.nextLine();
            
            if (Username.equals(manager_username)& Password.equals(manager_password)){
                loginCheck = true;
                System.out.println("You are now logged in succesfully.");
                showMenu(scanner, staff, projectGroup);
            }else { 
                System.out.println("Invalid username or password.");
               
            }
        }
        
    }
    private static void showMenu (Scanner scanner, ArrayList<CA2_Programming.employee>staff, CA2_Programming.employee[] projectGroup) {
        System.out.println("Menu");
        System.out.println("1. view current staff");
        System.out.println("2. Add new staff");
        
        int menuOption = getmenuOption (scanner);
        
        switch (menuOption) {
            case 1: 
                viewCurrentStaff(staff, projectGroup);
                break;
            case 2:
                addNewStaff (staff, scanner);
                break;
            default:
                System.out.println("Please only pick a number 1 or 2");
         
        }
    }
        private static int getmenuOption (Scanner scanner) {
            System.out.println("Enter your choice: ");
            return scanner.nextInt();
        }
        
        private static void viewCurrentStaff (ArrayList<CA2_Programming.employee> staff, CA2_Programming.employee[] projectGroup) {
            System.out.println("Current staff: ");
            for (CA2_Programming.employee emp : projectGroup) {
                System.out.println(emp.getName());
                System.out.println(emp.getEmpNum());
            }
            for (CA2_Programming.employee emp : staff) {
                System.out.println(emp.getName());
                System.out.println(emp.getEmpNum());
            }
        }    
            
        private static void addNewStaff (ArrayList<CA2_Programming.employee> staff, Scanner scanner) {
            System.out.println("Please enter employee name: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Please enter employee email: ");
            String email = scanner.nextLine();
            
            CA2_Programming.employee newEmployee = new CA2_Programming.employee (name, email);
            staff.add(newEmployee);         
            
                                 
        }
                     
}
