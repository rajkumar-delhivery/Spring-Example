package SpringBeanLifeCycle.LIfeCycleOrder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by delhivery on 24/10/16.
 */
public class MyBeanPostProcessor implements BeanPostProcessor{

    public Object postProcessAfterInitialization(Object Bean, String beanName) throws BeansException{
        System.out.println("BeanPostProcessor.postProcessAfterInitialization");
        return Bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }
}
