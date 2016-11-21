package SpringStreotypeAnnotation.Config;

import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.Appconfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletRegistration.Dynamic;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by delhivery on 26/10/16.
 */
public class WebAppInitializer implements WebApplicationInitializer{

    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(Appconfig.class);
        context.setServletContext(servletContext);

        Dynamic dynamic = servletContext.addServlet("Dispatcher", new DispatcherServlet(context));
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
    }
}
