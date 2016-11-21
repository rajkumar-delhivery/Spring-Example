package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj;


import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.dao.BookDAO;
import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.service.UserService;
import ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.util.CalcUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by delhivery on 25/10/16.
 */
public class SpringFilterAspectjDemo {

    public static void main(String arg[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfigForRegex.class);
        context.refresh();

        try {
            CalcUtil calc = context.getBean(CalcUtil.class);
            System.out.println("Addition:" +calc.addNumbers(15,30));
        }
        catch (BeansException be){

            System.out.println(be.getMessage());

        }

        try {
            BookDAO book = context.getBean(BookDAO.class);
            System.out.println(book.getBookById(1));

        }
        catch (BeansException be){
            System.out.println(be.getMessage());
        }

        try {
            UserService service = context.getBean(UserService.class);
            System.out.println("User Role :" + service.getUserRole());
        }
        catch (BeansException be){
            System.out.println(be.getMessage());
        }

        context.close();

    }
}
