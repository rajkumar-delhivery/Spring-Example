package spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by delhivery on 4/10/16.
 */

@Aspect
public class EmployeeAnnotationAspect {

    @Before("annotation(spring.aspect.Loggable)")
    public void myAdvice(){
        System.out.println("Executing MyAdvice");
    }
}
