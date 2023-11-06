/**
 * @author: 徐杰
 * @description: 用字符串显示的类 桥 类的实现层次结构
 * @dateTime: 2023/10/25 16:30
 * @Return
 **/
public class StringDisplayImpl extends DisplayImpl{
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width=string.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");

        }
        System.out.println("+");
    }

    @Override
    public void rawClose() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string+"|");
    }
}
