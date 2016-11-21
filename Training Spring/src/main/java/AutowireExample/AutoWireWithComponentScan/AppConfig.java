package AutowireExample.AutoWireWithComponentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by delhivery on 24/10/16.
 */

@Configuration
@ComponentScan(basePackages = "AutowireExample/AutoWireWithComponentScan")
public class AppConfig {
}
