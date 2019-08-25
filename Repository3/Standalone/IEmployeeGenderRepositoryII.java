package com.winston.Repository3.Standalone;

import com.winston.Domain1.StandalonePackage.EmployeeGender;
import com.winston.Repository3.IRepositoryI;

import java.util.Set;

public interface IEmployeeGenderRepositoryII extends IRepositoryI<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
