package SpringAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);

        System.out.println(employeeService.getEmployee().getName());

        employeeService.getEmployee().setName("Pankaj");

        employeeService.getEmployee().throwException();

        ctx.close();
    }
}
