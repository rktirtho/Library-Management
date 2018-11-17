/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

/**
 *
 * @author DELL
 */
public class Student extends Human{
    private String department;
    private final String roll;
    private String semester;
    private final String batch;

    public Student(String department, String roll, String semester, String batch, 
            String name, String DOB, Address address) {
        super(name, DOB, address);
        this.department = department;
        this.roll = roll;
        this.semester = semester;
        this.batch = batch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
    
  
    
    
}
