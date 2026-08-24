/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patient;

/**
 *
 * @author katle
 */
//import java.util.Scanner;
    public final class BedManagement {
        
        
        private Bed [] beds;// array to count the 20 beds
        private Patient[]patients;
        private int bedCount;
        private int patientCount;//counts the amount of patients coming in
        private Object bedID;
        
        //bed management method, it hols the amount of patients and beds

        public BedManagement(){
            beds = new Bed[20];
            patients = new Patient[100];
            bedCount = 0;//index 0 
            patientCount = 0;
            createBeds();
    }
        
       public void createBeds(){
           for(int i = 1; i <= 20; i++){
               String bedID = String.format("B%02d", i);// format- aligns or formats the number or beds B01 and B02
               String ward;//It will store the wards
               
               //If else statement fro Ward option
               if(i <= 5) ward = "Ward A";
               else if(i <= 10) ward = "Ward B";
               else if(i <= 15)ward = "Ward C";
               else ward = "Ward D";
               
               //creates a bed object; false means bed is not occupied and null means no patient is occupying the bed
               beds[bedCount] = new Bed(bedID, ward, false, null); //
               
               bedCount++;
           }
       }
       
       public void registerPatient(Patient p){
           if(patientCount < patients.length){
           patients[patientCount] = p;
           patientCount++;
           System.out.println(p.getFirstName() + "Registered successfully");
           }
            }
       
       public void allocateBed(Patient p){ //allocates beds to inpatients only
            if(p.patientCategory!=PatientCategory.Inpatient){
                System.out.println(p.getFirstName() + " is OUTPATIENT, No bed needed.");
                return;
               }
            for(int i = 0; i < bedCount; i++){
                if(!beds[i].isIsOccupied());
                beds[i].assignPatient(p);
                //if the patient is an inpatient, they will be given a bed
                System.out.println("Bed " + beds[i].getBedID() + " allocated to " + p.getFirstName() + " successfully");
                return;
           }
           
           //If there are no beds found after loop
           System.out.println("Sorry " + p.getFirstName() + ", no beds are available in ");
       }
       
      public void dischargePatient(String bedID){
          
          for(int i = 0; i < bedCount; i++){
              if(beds[i].getBedID().equals(bedID)){
                  beds[i].dischargePatient();
                  
                  System.out.println("patient discharged from " + bedID);
                  return;
              }
              }
          //if patient is discahrged, the  bed is not found
          System.out.println("Bed " + bedID + " not found");
      }
      
      public void viewBeds(){
          System.out.println("BED STATUS");
          for(int i = 0; i < bedCount; i++){
             
              //toString calls to bed.java class
              System.out.println(beds[i].toString());
          }
      }
      
      public Patient searchPatient(String patientId){
          for(int i = 0; i < patientCount; i++){
              if(patients[i]!= null && patients[i].getPatientId().equalsIgnoreCase(patientId)){
                  return patients[i];
              }
          }
          return null;
      }
      public boolean updatePatient(String patientId, Patient updatedPatient){
          for(int i = 0; i < patientCount; i++){
          if(patients[i]!= null && patients[i].getPatientId().equalsIgnoreCase(patientId)){
              patients[i] = updatedPatient;
              return true;
          }
      }
          return false;
      }
      public boolean deletePatient(String patientId){
          for(int i = 0; i < patientCount; i++){
               if(patients[i]!= null && patients[i].getPatientId().equalsIgnoreCase(patientId)){
                   for(int k = i; k < patientCount - 1; k++){
                       patients[k] = patients[k + 1];
                   }
                   patients[patientCount - 1] = null;
                   //patientCount==;
                   return true;
               }
          }
          return false;
      }
      
      public void displayAllPatients(){
          if(patientCount == 0){
              System.out.println("NO PATIENT REGISTERED!");
              return;
          }
          for(int i = 0; i < patientCount; i++){
              patients[i].displayDetails();
              
              System.out.println("===========");
          }
      }
}

