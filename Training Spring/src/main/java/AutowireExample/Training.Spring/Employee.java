package AutowireExample.Training.Spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by delhivery on 24/10/16.
 */

public class Employee {

    @Autowired
    private Company company;
    public Company getCompany() {
        return company;
    }

    void setCompany(Company company) {
        this.company = company;
    }
}