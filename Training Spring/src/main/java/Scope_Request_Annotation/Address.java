package Scope_Request_Annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 28/10/16.
 */


@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component
public class Address {

    private String city = "Delhi";

    public Address(){
        System.out.println("I am From "+city);
    }

    public String getCity(){
        return city;
    }

}
