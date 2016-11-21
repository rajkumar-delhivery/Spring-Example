package AutowireExample.Training.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 24/10/16.
 */

@Configuration
public class AppConfig {

//    @Bean
//    @AliasFor ("RAM")
//    public Company getCompanyName(){
//        Company company = new Company();
//        company.setCompName("ABCD");
//        company.setLocation("Delhi");
//        return company;
//    }
    @Bean
    public Company getCompanyNa(){
        Company company = new Company();
        company.setCompName("ABCDE");
        company.setLocation("Delhi-NCR");
        return company;
    }

    @Bean
    public Employee getEmployee(){
        return new Employee();
    }
}
