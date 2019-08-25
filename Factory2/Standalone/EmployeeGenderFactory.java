package com.winston.Factory2.Standalone;

import com.winston.Domain1.StandalonePackage.EmployeeGender;

//returning empnum and their race as object
public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(String empId, String genderId){

        return new EmployeeGender().employeeGender(empId, genderId);
    }
}
