package spring.service;

import spring.model.Employee;

/**
 * Created by delhivery on 3/10/16.
 */
public class EmployeeService {
    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee emp){
        this.employee = emp;
    }
}
