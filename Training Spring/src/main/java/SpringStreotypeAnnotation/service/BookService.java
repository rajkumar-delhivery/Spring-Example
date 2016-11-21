package SpringStreotypeAnnotation.service;

import SpringStreotypeAnnotation.dao.BookDAO;
import SpringStreotypeAnnotation.utility.BookUtility;
import SpringStreotypeAnnotation.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by delhivery on 26/10/16.
 */

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private BookUtility bookUtility;

    public String larrgestAreaBookName(){
        int lgarea = 0;
        String bookName = "";

        for (int i = 0; i < 2 ; i++){
            Book book = bookDAO.getBook(i);

            int area = bookUtility.calculateArea(book.getBookId(), book.getWidth());

            if(lgarea < area){
                lgarea = area;
                bookName = book.getBookName();

            }
        }

        return bookName;
    }
}
