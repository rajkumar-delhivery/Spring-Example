
/**
 * Created by delhivery on 23/8/16.
 */
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
// Application Conatains the main method
public class MainApp {
    public static void main(String[] args){


        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");


        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();

        //context.registerShutdownHook(); //to shutdown  the context on completion of main method
//      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
//      objB.getMessage();
    }
}
