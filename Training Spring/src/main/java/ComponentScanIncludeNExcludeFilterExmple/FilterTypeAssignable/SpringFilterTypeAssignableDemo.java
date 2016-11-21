package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable;


import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.service.UserService;
import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAssignable.util.CalcUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 26/10/16.
 */
public class SpringFilterTypeAssignableDemo {
    public static void main(String arg[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Appconfig.class);
        context.refresh();

        try{

            CalcUtil cu = context.getBean(CalcUtil.class);
            System.out.println(cu.multiply(2,5,7));

        }

        catch (BeansException be){
            System.out.println(be.getMessage());
        }

        try{
            UserService service = context.getBean(UserService.class);
            System.out.println(service.getUserRole());
        }

        catch (BeansException be){
            System.out.println(be.getMessage());
        }
        context.close();
    }
}
