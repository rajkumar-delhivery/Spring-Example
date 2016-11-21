package spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by delhivery on 4/10/16.
 */

@Aspect
public class EmployeeAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice(){

        System.out.println("Executing Advice on getName()");
    }

    @Before("execution(* spring.service.*.get*())")
    public void getAllAdvice(){
        System.out.println("Service method getter called");
    }
}
