package RequiredAnnotationExmpl;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by delhivery on 27/10/16.
 */
public class Person {

    private College college;

    public College getCollege() {
        return college;
    }

    @Required
    public void setCollege(College college) {
        this.college = college;
    }
}
