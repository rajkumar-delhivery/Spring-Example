package RequiredAnnotationExmpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 27/10/16.
 */

@Configuration
public class AppConfig {

    @Bean
    public College college(){
        College college = new College();

        college.setName("IIIT-A");
        college.setLocation("Allahabad");

        return college;
    }

    @Bean

    public Person person(College college){
        Person person = new Person();

        person.setCollege(college);

        return person;
    }
}
