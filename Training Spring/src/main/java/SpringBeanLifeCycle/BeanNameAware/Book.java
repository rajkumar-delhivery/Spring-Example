package SpringBeanLifeCycle.BeanNameAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;

/**
 * Created by delhivery on 24/10/16.
 */
public class Book implements BeanNameAware, BeanFactoryAware {

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private String bookName;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Book b = beanFactory.getBean(Book.class);
        b.setBookName(getBookName() + "-Updated");
    }

    public void setBeanName(String name) {

        System.out.println("Bean Name : " + name);

    }
}
