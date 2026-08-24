package com.mycompany.patient;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author katle
 */
public class MedicareHospitalPOETest {
    
    private BedManagement hospital;
    private Patient inpatient;
    private Patient outpatient;

    @BeforeEach
    void setUp(){
        hospital = new BedManagement();
        inpatient = new Patient("P001", "Kat", "Test", 20, "Female", "Flu0", PatientCategory.Inpatient);
        outpatient = new Patient("P002", "John", "Test", 35, "Male" ,"Sinus", PatientCategory.Outpatient);
    }
    @Test
    void testRegisterPatient(){
        hospital.registerPatient(inpatient);
        assertNotNull(hospital.searchPatient("P001"));
    }
    
    @Test
    void testAllocateBedForInpatient(){
        hospital.registerPatient(inpatient);
        hospital.allocateBed(inpatient);
        assertTrue(hospital.getBed()[0].isOccupied(), "First bed should be occupied");
        assertEquals("P001", hospital.getBeds()[0].getPatient().getPatientID());
    }
    @Test
    void testNoBedForOutpatient(){
        hospital.registerPatient(outpatient);
        hospital.allocateBed(outpatient);
        
        assertNotNull(hospital.searchPatient("P002"));
    }
    
    @Test
    void testDischargePatient(){
        hospital.registerPatient(inpatient);
        hospital.allocateBed(inpatient);
        hospital.dischargePatient("P001");
        
        patient p3 = new Patient("P003", "A", "B", 30, "Female", "Head", PatientCaregory.Inpatient);
        assertFalse(hospital.getBeds()[0].isOccupied());
    }
    @Test 
    void testSearchPatientNotFound(){
        assertNull(hospital.searchPatient("P000"));
    }
     }
