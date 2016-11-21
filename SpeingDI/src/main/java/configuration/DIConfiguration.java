package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.EmailService;
import services.MessageService;

/**
 * Created by delhivery on 3/10/16.
 */

@Configuration
@ComponentScan(value = {"SDinjection.consumer"})
public class DIConfiguration {

    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}
