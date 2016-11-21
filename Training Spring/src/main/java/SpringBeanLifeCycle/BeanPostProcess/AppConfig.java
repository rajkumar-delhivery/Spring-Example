package SpringBeanLifeCycle.BeanPostProcess;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 24/10/16.
 */

@Configuration
@ComponentScan(basePackages = "SpringBeanLifeCycle.BeanPostProcess")
public class AppConfig {

    @Bean(name = "MyBEAN")

    public Book getBean(){
        Book book = new Book();
        book.setBookname("Stronger");
        return book;
    }
}
