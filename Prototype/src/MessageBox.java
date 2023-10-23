import framework.Product;

/**
 * @author: 徐杰
 * @description: 将字符串放入方框并使其显示出来的类。实现use方法和createClone方法
 * @dateTime: 2023/10/23 10:22
 * @Return
 **/
public class MessageBox implements Product {

    private char decochar;

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println(" ");
    }

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
