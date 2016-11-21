package NamedNInjectAnnotationExmpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 25/10/16.
 */
public class SpringDemo {

    public  static void main(String []arg) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AppConfig.class);
        context.refresh();

        EmployeeService service = context.getBean(EmployeeService.class);

        System.out.println(service.getEmployee().getMessage());
        context.close();
    }
}


