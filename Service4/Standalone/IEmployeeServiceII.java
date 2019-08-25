package com.winston.Service4.Standalone;

import com.winston.Domain1.StandalonePackage.Employee;
import com.winston.Service4.IServiceI;

import java.util.Set;

public interface IEmployeeServiceII extends IServiceI<Employee, String> {
    Set<Employee> getAll();

    Employee createEmployee(String empNum, String firstName, String lastName, String race, String gender);
}
