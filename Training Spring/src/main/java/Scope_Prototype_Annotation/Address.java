package Scope_Prototype_Annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.xml.transform.sax.SAXSource;

/**
 * Created by delhivery on 28/10/16.
 */

@Scope("singleton")

@Component

public class Address {

    private String city = "GURUGRAM";

    public Address() {
        System.out.println("My CITY :" +city);
    }

    public String getCity() {
        return city;
    }


}
