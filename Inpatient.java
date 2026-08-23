/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patient;

/**
 *
 * @author katle
 */
public class Inpatient {

     //public static void main(String[] args) {
        private String wardName;
        private int bedNumber;

     //public constructors
    public Inpatient(String wardName, int bedNumber) {
        this.wardName = wardName;
        this.bedNumber = bedNumber;
    }
     //getter and set methods
    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }
   // @Override
    public void displayDetails(){
        System.out.println("Ward Name " + wardName);
        System.out.println("Bed Number " + bedNumber);
    
}
}



