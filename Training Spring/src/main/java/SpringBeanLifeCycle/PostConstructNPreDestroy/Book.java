package SpringBeanLifeCycle.PostConstructNPreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by delhivery on 24/10/16.
 */
public class Book {

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //@PostConstruct
    public void init(){
        System.out.println("Inside INIT()");
    }

   // @PreDestroy
    public void destroy(){
        System.out.println("inside Destroy method");
    }
}
