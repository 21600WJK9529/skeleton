package com.winston.Factory2.Standalone;

import com.winston.Domain1.StandalonePackage.Employee;

//explanation in dependant
public class EmployeeFactory {
    public static Employee getEmployee(String empNum, String fName, String lName ){
        return new Employee.Builder()
                .empNumber(empNum)
                .empFirstName(fName)
                .empLastName(lName)
                .build();
    }
}
