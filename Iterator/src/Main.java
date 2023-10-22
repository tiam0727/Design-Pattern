/**
 * @Author: 徐杰
 * @Description:
 * @DateTime: 2023/10/22 20:04
 * @Params:
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("tpc一顿吃一斤"));
        bookShelf.appendBook(new Book("gzy常年手脚冰冷"));
        bookShelf.appendBook(new Book("tpc爱搓憋"));
        bookShelf.appendBook(new Book("tpc跳跃击打"));
//        测试将BookShlf改为用ArrayList后增加超过原先设置数量的书籍是否可以成功
        bookShelf.appendBook(new Book("tpc跳跃击打"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }

}
