package SpringBeanLifeCycle.LIfeCycleOrder;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book implements InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, BeanClassLoaderAware {
    private String bookName;
    private Book() {
        System.out.println("---inside constructor---");
    }

    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("---BeanClassLoaderAware.setBeanClassLoader---");
    }

    public void setBeanName(String name) {
        System.out.println("---BeanNameAware.setBeanName---");
    }
    public void myPostConstruct() {
        System.out.println("---init-method---");
    }
    @PostConstruct
    public void springPostConstruct() {
        System.out.println("---@PostConstruct---");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("---BeanFactoryAware.setBeanFactory---");
    }
    public void afterPropertiesSet() throws Exception {
        System.out.println("---InitializingBean.afterPropertiesSet---");
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
        System.out.println("setBookName: Book name has set.");
    }
    public void myPreDestroy() {
        System.out.println("---destroy-method---");
    }
    @PreDestroy
    public void springPreDestroy() {
        System.out.println("---@PreDestroy---");
    }

    public void destroy() throws Exception {
        System.out.println("---DisposableBean.destroy---");
    }
    @Override
    protected void finalize() {
        System.out.println("---inside finalize---");
    }
} 