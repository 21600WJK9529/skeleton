package com.winston.Service4.Standalone.Impl;

import com.winston.Domain1.StandalonePackage.EmployeeGender;
import com.winston.Repository3.Standalone.IEmployeeGenderRepositoryII;
import com.winston.Repository3.Standalone.ImplementationIII.EmployeeGenderRepositoryImpl;
import com.winston.Service4.Standalone.IEmployeeGenderServiceII;

import java.util.Set;

public class EmployeeServiceImpl implements IEmployeeGenderServiceII{
    private static EmployeeGenderServiceImpl service = null;
    private IEmployeeGenderRepositoryII repository;

    public EmployeeServiceImpl() {
        repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }

    public static EmployeeGenderServiceImpl getService(){

        if(service == null){
            return new EmployeeGenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String id) {
        return repository.read(id);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return repository.update(employeeGender);
    }

    @Override
    public void delete(String id) {

        repository.delete(id);

    }
}
