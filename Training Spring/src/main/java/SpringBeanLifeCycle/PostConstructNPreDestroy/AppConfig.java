package SpringBeanLifeCycle.PostConstructNPreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 24/10/16.
 */

@Configuration
@ComponentScan(basePackages = "SpringBeanLifeCycle.PostConstructNPreDestroy")
public class AppConfig {

    @Bean(name = "HelloW", initMethod = "init", destroyMethod = "destroy")

    public Book getBean(){
        Book book = new Book();
        book.setBookName("FAAAAAAAAAAAAD");
        return book;
    }
}
