package com.winston.Repository3.Standalone.ImplementationIII;

import com.winston.Domain1.StandalonePackage.EmployeeGender;
import com.winston.Repository3.Standalone.IEmployeeGenderRepositoryII;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements IEmployeeGenderRepositoryII {

        private static EmployeeGenderRepositoryImpl employeeGenderRepository = null;
        private Set<EmployeeGender> employeeGenders;

        private EmployeeGenderRepositoryImpl(){
            employeeGenders = new HashSet<EmployeeGender>();
        }

        public static EmployeeGenderRepositoryImpl getEmployeeGenderRepository() {
            if(employeeGenderRepository == null){
                return new EmployeeGenderRepositoryImpl();
            }
            return employeeGenderRepository;
        }

        public Set<EmployeeGender> getAll() {
            return employeeGenders;
        }

        public EmployeeGender create(EmployeeGender employeeGender) {
            employeeGenders.add(employeeGender);
            return employeeGender;
        }

        public EmployeeGender read(String id) {
            return employeeGenders.stream().filter(employeeGender -> employeeGender.getEmpNumber() == id).findAny().orElse(null);
        }

        public EmployeeGender update(EmployeeGender employeeGender) {

            EmployeeGender toUpdate = read(employeeGender.getEmpNumber());

            if(employeeGenders.contains(employeeGender)){
                employeeGenders.remove(employeeGender);
                employeeGenders.add(toUpdate);
            }
            return null;
        }

        public void delete(String id) {
            EmployeeGender toDelete = read(id);
            if (toDelete != null){
                employeeGenders.remove(toDelete);
            }
        }
}
