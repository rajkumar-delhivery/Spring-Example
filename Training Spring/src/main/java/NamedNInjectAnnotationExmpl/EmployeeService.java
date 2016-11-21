package NamedNInjectAnnotationExmpl;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by delhivery on 25/10/16.
 */

@Named
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Inject
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
