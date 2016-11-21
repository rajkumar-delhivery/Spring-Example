package SpringStreotypeAnnotation.dao;

import SpringStreotypeAnnotation.vo.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by delhivery on 26/10/16.
 */

@Repository
public class BookDAO {

    List<Book> bookList = new ArrayList<Book>();

    {
        Book b1 = new Book(1, "Thik&GROWRICH",4,5);
        Book b2 = new Book(2, "MAHABHARAT",6,7);

        bookList.add(b1);
        bookList.add(b2);

    }

    public Book getBook(int i){
        return bookList.get(i);
    }
}
