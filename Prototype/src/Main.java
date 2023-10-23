import framework.Manager;
import framework.Product;

/**
 * @author: 徐杰
 * @description: 测试行为
 * @dateTime: 2023/10/23 10:26
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);

        Product p1 = manager.create("strong message");
        Product p2 = manager.create("warning box");
        Product p3 = manager.create("slash box");
        p1.use("hello,world.");
        p2.use("hello,world.");
        p3.use("hello,world.");
    }
}
