package com.example.manju619.employeemvp.Model;

import java.util.Date;

/**
 * Created by Manju 619 on 09-04-2017.
 */

public class
EmployeeModel {

    String empNo;
    String firstName;
    String lastName;
    String birthDate;
    String gendor;
    String hireDate;

    public EmployeeModel(String empNo, String firstName, String lastName, String birthDate, String gendor, String hireDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gendor = gendor;
        this.hireDate = hireDate;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGendor() {
        return gendor;
    }

    public void setGendor(String gendor) {
        this.gendor = gendor;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
