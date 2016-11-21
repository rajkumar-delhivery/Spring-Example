package SpringBeanLifeCycle.BeanPostProcess;

import SpringBeanLifeCycle.BeanPostProcess.Book;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor.postProcessAfterInitialization : Bean Name : " + bean);
        if (bean instanceof Book)
            System.out.println(((Book) bean).getBookname()+" : Before");
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
        System.out.println("BeanPostProcessor.postProcessBeforeInitialization : Bean Name :"+ bean);
        if (bean instanceof Book)
            System.out.println(((Book) bean).getBookname()+" : AFTER");
        return bean;
    }
}