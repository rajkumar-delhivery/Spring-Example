package AutowireExample.QualifierWithAutoWire;

import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 24/10/16.
 */

@Component(value = "deer")
public class Deer implements Animal{

    public void printName(){
        System.out.println("------deer--------");
    }
}
