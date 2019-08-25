package com.winston.Controller5;

import com.winston.Domain1.StandalonePackage.Employee;
import com.winston.Service4.Standalone.IEmployeeServiceII;
import com.winston.Service4.Standalone.Impl.EmployeeServiceImpl;

public class EmployeeController {
    private IEmployeeServiceII employeeService = EmployeeServiceImpl.getService();

    public Employee createEmployee(String empNum, String fName, String lName, String gender, String race){

        return employeeService.createEmployee(empNum, fName, lName, gender, race);

    }
}
