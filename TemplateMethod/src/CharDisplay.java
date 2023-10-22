/**
 * @author: 徐杰
 * @description: 只实现了open、print、close方法的类
 * @dateTime: 2023/10/22 22:41
 * @Return
 **/
public class CharDisplay extends AbstractDisplay{

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
