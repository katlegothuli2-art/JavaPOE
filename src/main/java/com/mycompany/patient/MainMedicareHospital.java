/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.patient;

/**
 *
 * @author katle
 */
import java.util.Scanner;
public class MainMedicareHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //This creates the hospital and inputs the beds
        BedManagement hospital = new BedManagement();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== WELCOME TO MEDICARE HOSPITAL ===");
        
        int choice = 0;
        while(choice != 8){
            
            System.out.println("MEDICARE HOSPITAL MAIN MENU");
            System.out.println("1. Register new patient ");
            System.out.println("2. Search for patient using ID ");
            System.out.println("3.Update patient details ");
            System.out.println("4.Delete a patient ");
            System.out.println("5.Display all patients ");
            System.out.println("6.Allocate Bed or View Beds ");
            System.out.println("7.Discharge patient ");
            System.out.println("8. Exit");   
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if(choice == 1){
                
        System.out.print("Enter Patient ID: ");
        String patientID = scanner.nextLine();
        
        System.out.print("Enter Patient First name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Patient last name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter Patient gender: ");
        String gender = scanner.nextLine();
        
        System.out.println("Enter medical condition: ");
        String medicalCondition = scanner.nextLine();
        
        System.out.print("Enter Patient category: INPATIENT or OUTPATIENT: ");
                
       PatientCategory patientCategory;
       String input = scanner.nextLine();
       if(input.equalsIgnoreCase("inpatient")){
           patientCategory = PatientCategory.Inpatient;
       }else{
           patientCategory = PatientCategory.Outpatient;
       }
        
        //patient object
        Patient p1 = new Patient(patientID, firstName, lastName, age, gender, medicalCondition,patientCategory);
          hospital.registerPatient(p1);
          hospital.allocateBed(p1);
          
          // Choice 2 will find patient using their ID, if not found it will display NOT FOUND
            }else if(choice == 2){
                System.out.print("Enter Patient ID to search: ");
                String id = scanner.nextLine();
                Patient found = hospital.searchPatient(id);
                if(found != null){
                    found.displayDetails();
                }else {
                    System.out.println("Patient not Found!");
                }
                //Choice 3 updates patient id
            } else if(choice == 3){
                
                System.out.print("Enter Patient ID to Update: ");
                String id = scanner.nextLine();
                
                Patient exisiting = hospital.searchPatient(id);
                System.out.print("Enter Patient ID: ");
                String patientID = scanner.nextLine();
        
               System.out.print("Enter Patient First name: ");
               String firstName = scanner.nextLine();
        
               System.out.print("Enter Patient last name: ");
               String lastName = scanner.nextLine();
        
               System.out.print("Enter Patient age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
        
               System.out.println("Enter Patient gender: ");
               String gender = scanner.nextLine();
        
               System.out.println("Enter medical condition: ");
               String medicalCondition = scanner.nextLine();
        
             System.out.print("Enter Patient category: INPATIENT or OUTPATIENT: ");
                 
              Patient updated = new Patient(id, firstName, lastName, age, gender, medicalCondition, PatientCategory.Inpatient); 
                if(hospital.updatePatient(id, updated)){
                          
            System.out.println("Patient Updated.");
            }else{
            System.out.println("NOT FOUND");
                }
                
            //Patient will be removed from the system, if not they will be deleted
            }else if(choice == 4){
                    System.out.println("Enter Patient ID to remove from system: ");
                    String id2 = scanner.nextLine();
               
                if(hospital.deletePatient(id2)){
                    System.out.println("DELETED!");
                }else{
                    System.out.println("DELETE FAILED!");
                }
                //Choice 5 displays all the patients 
            }else if(choice == 5){
                
                hospital.displayAllPatients();
            
            //Displays viewed beds
            }else if(choice == 6){
                
               hospital.viewBeds();
           
               //If patient is an outpatient or are being discharged, they will need to input ID to be discharged
            }else if(choice == 7){
                System.out.println("Enter bed ID to Discharge: ");
                String bedID = scanner.nextLine();
                
                hospital.dischargePatient(bedID);
            }
        }
        String bedID = scanner.nextLine();
        scanner.close();
    }
}


