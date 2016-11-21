package ComponentScanIncludeNExcludeFilterExmple.FilterTypeAspectj.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by delhivery on 25/10/16.
 */

//@Repository
public class BookDAO {

    public String getBookById(int bookId){
        if(bookId == 1)
            return "Mohan";

        return "Sohan";
    }
}
