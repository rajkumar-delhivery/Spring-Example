package SpringStreotypeAnnotation.utility;

import org.springframework.stereotype.Component;

/**
 * Created by delhivery on 26/10/16.
 */

@Component
public class BookUtility {
    public int calculateArea(int a, int b){
        return (a*b)/2;
    }
}
