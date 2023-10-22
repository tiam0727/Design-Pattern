/**
 * @author: 徐杰
 * @description: 实现了open、print、close的类
 * @dateTime: 2023/10/22 22:42
 * @Return
 **/
public class StringDisplay extends AbstractDisplay{
    private String string;

    public int getWidth() {
        return width;
    }

    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width=string.getBytes().length;//获取字符串字节长度
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        printLine();
    }
    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
