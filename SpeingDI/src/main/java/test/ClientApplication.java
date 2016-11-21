package test;

import SDinjection.consumer.MyApplication;
import configuration.DIConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 3/10/16.
 */
public class ClientApplication {

    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);

        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("hi raj ", "kashwan92@gmail.com");
        context.close();

    }

}
