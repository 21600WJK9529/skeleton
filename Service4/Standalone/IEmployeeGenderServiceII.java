package com.winston.Service4.Standalone;

import com.winston.Domain1.StandalonePackage.EmployeeGender;
import com.winston.Service4.IServiceI;

import java.util.Set;

public interface IEmployeeGenderServiceII extends IServiceI<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
