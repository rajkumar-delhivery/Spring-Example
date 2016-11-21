package spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by delhivery on 4/10/16.
 */

@Aspect
public class EmployeeAroundAspect {

    @Around("execution(*spring.model.Employee.getName())")
    public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){

        System.out.println("Before invoking getName() method");
        Object value = null;

        try{
            value = proceedingJoinPoint.proceed();
        }
        catch (Throwable e){
            e.getStackTrace();
        }

        System.out.println("After invoking getName() method. Return value="+value);
        return value;
    }
}
