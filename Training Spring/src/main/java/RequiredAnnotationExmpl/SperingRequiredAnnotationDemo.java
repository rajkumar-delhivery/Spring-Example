package RequiredAnnotationExmpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 27/10/16.
 */
public class SperingRequiredAnnotationDemo {

    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Person person = context.getBean(Person.class);
        System.out.println(person.getCollege().getName());
        context.registerShutdownHook();
    }
}
