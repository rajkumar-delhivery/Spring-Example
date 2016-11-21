package Scope_Request_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 28/10/16.
 */

@Component
public class Teacher {

    @Autowired
    private Address teachAddress;

    public Address getTeachAddress(){
        return  teachAddress;
    }
}
