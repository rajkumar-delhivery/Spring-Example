package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by delhivery on 4/10/16.
 */

@Aspect
public class EmployeeAfterAspect {

    @After("args(name)")
    public void logStringArguments(String name){
        System.out.println("Running After Advice. String argument passed="+name);
    }

    @AfterThrowing("within(spring.model.Employee)")
    public void logExceptions(JoinPoint joinPoint){
        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
    }

    @AfterReturning(pointcut = "execution(*getName())", returning="returnString")
    public void getNameReturningAdvice(String returnString){

        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
    }

}
