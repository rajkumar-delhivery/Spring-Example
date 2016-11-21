package AutowireExample.Training.Spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootConfiguration
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Employee employee = context.getBean(Employee.class);
        System.out.println("CommName :" + employee.getCompany().getCompName());
        System.out.println("CommName :" + employee.getCompany().getLocation());
    }


}
