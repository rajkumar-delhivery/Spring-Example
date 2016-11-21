package SpringBeanLifeCycle.BeanNameAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 24/10/16.
 */

@Configuration
public class AppConfig {

    @Bean(name = "myBean")
    public Book getBean(){
        Book book = new Book();
        book.setBookName("Mahabharat");
        return book;
    }
}
