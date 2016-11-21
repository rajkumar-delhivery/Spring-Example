package AutowireExample.AutoWireWithComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by delhivery on 24/10/16.
 */

@Service

public class EmployeeService {

   private Employee employee;

    public Employee getEmployee() {
        return employee;
    }
    @Autowired
    private EmployeeService(Employee employee) {
        this.employee = employee;
        System.out.println("Hello");
    }

    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
