/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patient;

/**
 *
 * @author katle
 */
public class Bed {

   //Declarations 
    public String bedID;
    public String wardName;
    public Patient patient;
    public boolean isOccupied;
    
    //method for bed with declarations
    public Bed(String bedID, String wardName, boolean isOccupied, Patient patient){
       this.bedID = bedID;
       this.wardName = wardName;
       this.isOccupied = isOccupied;
       this.patient = patient;
    }
     //getter and set methods
    public String getBedID() {
        return bedID;
    }

    public void setBedID(String bedID) {
        this.bedID = bedID;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public boolean isIsOccupied() {
        return isOccupied;
    }

    public void setisIsOccupied(boolean isOccupied) {
        
        this.isOccupied = isOccupied;

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public void assignPatient(Patient p){
        this.patient = p;
        this.isOccupied = true;
    }
    public void dischargePatient(){
        this.patient = null;
        this.isOccupied = true;
    }

    @Override
    public String toString() {
        if(isOccupied){
        return bedID + " + " + wardName + " + " + ("[Occupied by " + patient.getFirstName() + "]"); 
        }else{
            //if bed is empty
            return bedID + " + " + wardName;
    } 
}
}
