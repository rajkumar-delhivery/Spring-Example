package AutowireExample.QualifierWithAutoWire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Created by delhivery on 24/10/16.
 */
public class SpringDemo {

    public static void main(String arg[]) throws SQLException{
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        AnimalService animal = ctx.getBean(AnimalService.class);
        animal.getAnimal().printName();
        System.out.println(animal.getZoo().getZooName());
        ctx.registerShutdownHook();

    }
}
