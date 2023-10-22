import java.io.UnsupportedEncodingException;

/**
 * @author: 徐杰
 * @description: 测试程序行为的类
 * @dateTime: 2023/10/22 22:42
 * @Return
 **/
public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        AbstractDisplay D1 = new CharDisplay('H');
        AbstractDisplay D2 = new StringDisplay("Hello, world.");
        StringDisplay d2 = (StringDisplay) D2;
        System.out.println(d2.getWidth());
        AbstractDisplay D3 = new StringDisplay("你好，世界。");
        StringDisplay d3 = (StringDisplay) D3;
        System.out.println(d3.getWidth());
        D1.display();
        D2.display();
        D3.display();
    }
}
