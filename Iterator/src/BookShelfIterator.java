/**
 * @Author: 徐杰
 * @Description:用于遍历书架的类
 * @DateTime: 2023/10/22 20:00
 * @Params:
 * @Return
 **/
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf=bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        if(index< bookShelf.getLength()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAtIndex(index);
        index++;
        return book;
    }
}
