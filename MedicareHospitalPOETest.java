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
        Inpatient = new Patient("P001", "Kat", "Test", 20, "Female", "Flu0", PatientCategory.Inpatient);
        Outpatient = new Patient("P002", "John", "Test", 35, "Male" ,"Sinus", PatientCategory.Outpatient);
    }
     }
