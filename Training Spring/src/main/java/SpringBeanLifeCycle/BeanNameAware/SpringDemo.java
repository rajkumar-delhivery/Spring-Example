package SpringBeanLifeCycle.BeanNameAware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 24/10/16.
 */
public class SpringDemo {

    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Book book = context.getBean(Book.class);
        System.out.println("BookNAme : "+ book.getBookName());
        context.close();
    }
}
