package spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

/**
 * Created by delhivery on 4/10/16.
 */
public class EmployeeAspectJoinPoint {

    @Before("execution(public void spring.model..set*(*))")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before running loggingAdvice on method="+joinPoint.toString());
        System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()));

    }

    @Before("args(name)")
    public void logStringArguments(String name){
        System.out.println("String argument passed="+name);
    }
}
