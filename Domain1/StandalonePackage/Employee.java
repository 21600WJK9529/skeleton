package com.winston.Domain1.StandalonePackage;

//Gender attached in EmployeeGender this just builds Employee
public class Employee {
    private String empNumber;
    private String empFirstName;
    private String empLastName;

    private Employee (){
    }

    public static class Builder {

        private String empNumber;
        private String empFirstName;
        private String empLastName;

        public Builder empNumber(String empNumber) {

            this.empNumber = empNumber;
            return this;

        }

        public Builder empFirstName(String empFName) {

            this.empFirstName = empFName;
            return this;

        }

        public Builder empLastName(String empLName) {

            this.empLastName = empLName;
            return this;

        }

        public Employee build() {
            return new Employee(this);
        }
    }
        public Employee(Builder builder){
            this.empNumber = builder.empNumber;
            this.empFirstName = builder.empFirstName;
            this.empLastName = builder.empLastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" + empNumber + '\'' +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }
}
