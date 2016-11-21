package SpringStreotypeAnnotation.vo;

/**
 * Created by delhivery on 26/10/16.
 */
public class Book {

    private int bookId;
    private String bookName;
    private int length;
    private int width;

    public Book(int bookId, String bookName, int length, int width){

        this.bookId= bookId;
        this.bookName = bookName;
        this.length = length;
        this.width =  width;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
