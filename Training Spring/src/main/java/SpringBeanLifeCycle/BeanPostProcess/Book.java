package SpringBeanLifeCycle.BeanPostProcess;

import org.springframework.beans.factory.InitializingBean;

/**
 * Created by delhivery on 24/10/16.
 */
public class Book implements InitializingBean {

    private String bookName;

    public String getBookname() {
        return bookName;
    }

    public void setBookname(String bookname) {
        this.bookName = bookname;
    }

    public void afterPropertiesSet() throws Exception{

        System.out.println("---afterPropertiesSet---");
        bookName = bookName + "-Hello";
    }
}
