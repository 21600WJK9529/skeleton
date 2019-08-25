package com.winston.Service4.Standalone.Impl;

import com.winston.Domain1.DependantPackage.Gender;
import com.winston.Domain1.DependantPackage.Race;
import com.winston.Domain1.StandalonePackage.Employee;
import com.winston.Domain1.StandalonePackage.EmployeeGender;
import com.winston.Factory2.Standalone.EmployeeFactory;
import com.winston.Factory2.Standalone.EmployeeGenderFactory;
import com.winston.Repository3.Dependant.IGenderRepositoryII;
import com.winston.Repository3.Dependant.IRaceRepositoryII;
import com.winston.Repository3.Dependant.ImplementationIII.GenderRepositoryImpl;
import com.winston.Repository3.Dependant.ImplementationIII.RaceRepositoryImpl;
import com.winston.Repository3.Standalone.IEmployeeGenderRepositoryII;
import com.winston.Repository3.Standalone.IEmployeeRepositoryII;
import com.winston.Repository3.Standalone.ImplementationIII.EmployeeGenderRepositoryImpl;
import com.winston.Repository3.Standalone.ImplementationIII.EmployeeRepositoryImpl;
import com.winston.Service4.Dependant.Implementation.GenderServiceImpl;
import com.winston.Service4.Dependant.Implementation.RaceServiceImpl;
import com.winston.Service4.Standalone.IEmployeeServiceII;

import java.util.Set;

public class EmployeeGenderServiceImpl implements IEmployeeServiceII {
    private static EmployeeServiceImpl service = null;
    private IEmployeeRepositoryII repository;
    private IGenderRepositoryII genderRepository;
    private IEmployeeGenderRepositoryII employeeGenderRepository;
    private IRaceRepositoryII raceRepository;

    public EmployeeGenderServiceImpl() {
        repository = EmployeeRepositoryImpl.getEmployeeRepository();
        genderRepository = GenderRepositoryImpl.getGenderRepository();
        employeeGenderRepository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
        raceRepository = RaceRepositoryImpl.getRaceRepository();
    }

    public static EmployeeServiceImpl getService(){

        if(service == null){
            return new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee read(String id) {
        return repository.read(id);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.update(employee);
    }

    @Override
    public void delete(String id) {

        repository.delete(id);

    }

    @Override
    public Employee createEmployee(String empNum, String firstName, String lastName, String race, String gender){

        Gender aGender = GenderServiceImpl.getService().readByName(gender);
        if(aGender == null){
            System.out.println("Gender is null");
        }

        Race aRace = RaceServiceImpl.getService().readByName(race);
        if(aRace == null){
            System.out.println("Race is null");
        }

        Employee employee = EmployeeFactory.getEmployee(empNum,firstName, lastName);
        if(employee == null){
            System.out.println("No employee data");
        }

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(employee.getEmpNumber(), aGender.getGenderId());
        employeeGenderRepository.create(employeeGender);

        Employee createdEmp = create(employee);

        return createdEmp;

    }

}
