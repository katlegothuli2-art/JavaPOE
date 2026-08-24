/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patient;

/**
 *
 * @author katle
 */
public class Patient {

    //public static void main(String[] args) {
    
//Use private to encapsulate patient's personal information    }
    private String patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String medicalCondition;
    public PatientCategory patientCategory;
    String name;
    
    //Public Constructor
    public Patient(String patientId, String firstName, String lastName, int age, String gender, String medicalCondition,PatientCategory patientCategory){
        //this. keyword refers directly to the current instance of the class being coded
        this.patientId=patientId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
        this.medicalCondition=medicalCondition;
        this.patientCategory = patientCategory;
    }

   
    //getter method and setter methods
    public String getPatientId() {
        return patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMedicalCondtion() {
        return medicalCondition;
    }

    public PatientCategory getPatientCategory() {
        return patientCategory;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMedicalCondtion(String medicalCondtion) {
        this.medicalCondition = medicalCondtion;
    }

    public void setPatientCategory(PatientCategory patientCategory) {
        this.patientCategory = patientCategory;
    }
    //display patient details
    public void displayDetails(){
        System.out.println("Patient ID: " + patientId);
        System.out.println("First Name " + firstName);
        System.out.println("Last Name " + lastName);
        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        System.out.println("Medical Condition " + medicalCondition);
        System.out.println("Patient Category " + patientCategory);
    }
}
