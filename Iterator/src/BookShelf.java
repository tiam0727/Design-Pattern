import java.util.ArrayList;

/**
 * @Author: 徐杰
 * @Description: 表示书架的类
 * @DateTime: 2023/10/22 19:54
 * @Params:
 * @Return
 **/
public class BookShelf implements Aggregate{
//    private Book[] books;
    private ArrayList<Book> books;
    private int last=0;
    public BookShelf(int maxsize){
//        this.books=new Book[maxsize];
        books=new ArrayList<Book>(maxsize);
    }
    public Book getBookAtIndex(int index){
//        return books[index];
        return books.get(index);
    }

    public void appendBook(Book book){
//        this.books[last]=book;
        books.add(book);
//        last++;

    }
    public int getLength(){
//        return last;
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
