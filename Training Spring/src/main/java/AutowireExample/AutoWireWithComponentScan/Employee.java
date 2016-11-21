package AutowireExample.AutoWireWithComponentScan;

import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 24/10/16.
 */

@Component
public class Employee {
    public String getEmpMsg() {
        return "Software makes world beautiful";
    }
}
