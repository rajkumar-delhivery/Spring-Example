package AutowireExample.QualifierWithAutoWire;

import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 24/10/16.
 */

@Component
public class Zoo {

    public String getZooName(){
        return "ABC Zoo";
    }
}
