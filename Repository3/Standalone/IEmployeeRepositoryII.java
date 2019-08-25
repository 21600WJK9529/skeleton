package com.winston.Repository3.Standalone;

import com.winston.Domain1.StandalonePackage.Employee;
import com.winston.Repository3.IRepositoryI;

import java.util.Set;

public interface IEmployeeRepositoryII extends IRepositoryI<Employee, String> {
    Set<Employee> getAll();
}
