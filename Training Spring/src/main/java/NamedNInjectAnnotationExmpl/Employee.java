package NamedNInjectAnnotationExmpl;

import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by delhivery on 25/10/16.
 */

//@Named
@Component
public class Employee {

    public String getMessage(){
        return "Engineers MOVE the World";
    }
}
