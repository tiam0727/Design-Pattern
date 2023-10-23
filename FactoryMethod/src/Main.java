import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

/**
 * @author: 徐杰
 * @description: 使用framework包和idcard包来制作和使用IDCard
 * @dateTime: 2023/10/23 8:44
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("土狗");
        Product product2 = factory.create("摇摆扬");
        Product product3 = factory.create("左右为楠");
        product1.use();
        product2.use();
        product3.use();
    }
}
