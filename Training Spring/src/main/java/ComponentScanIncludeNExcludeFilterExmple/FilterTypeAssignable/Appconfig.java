package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable;

import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.service.IUserService;
import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.util.ICalcUtil;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by delhivery on 25/10/16.
 */

@Configuration
@ComponentScan(basePackages = "ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable",
includeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IUserService.class),
excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = ICalcUtil.class))
public class Appconfig {
}
