package com.winston.Domain1.StandalonePackage;
//Bridging class linking primary keys of Dependant and Standalone
public class EmployeeGender {
    private String genderId;
    private String empNumber;

    public EmployeeGender(){
    }
    public EmployeeGender employeeGender(String empNumber, String genderId){
        this.empNumber = empNumber;
        this.genderId = genderId;
        return this;
    }

    public String getGenderId() {
        return genderId;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "genderId='" + genderId + '\'' +
                ", empNumber='" + empNumber + '\'' +
                '}';
    }
}
