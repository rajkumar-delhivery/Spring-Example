package Scope_Prototype_Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 28/10/16.
 */
public class SpringMainDemo {

    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Student st = context.getBean(Student.class);

        System.out.println(st.getStAddress().getCity());

    }
}
