package AutowireExample.QualifierWithAutoWire;

import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 24/10/16.
 */

@Component(value = "Fox")
public class Fox implements Animal{

    public void printName(){
        System.out.println("--------Fox--------");
    }
}
