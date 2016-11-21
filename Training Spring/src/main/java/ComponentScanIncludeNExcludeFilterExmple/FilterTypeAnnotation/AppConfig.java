package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by delhivery on 25/10/16.
 */

@Component
@ComponentScan(basePackages = "ComponentScanIncludeNExcludeFilterExmple",
        includeFilters = @ComponentScan.Filter(MyAnnotation.class),
        excludeFilters = @ComponentScan.Filter(Repository.class))
public class AppConfig {

}
