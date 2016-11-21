package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by delhivery on 26/10/16.
 */

@Configuration
@ComponentScan(basePackages = "ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj",
includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.*.*Service"),
excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.*.*Util"))
public class AppConfigForRegex {
}
