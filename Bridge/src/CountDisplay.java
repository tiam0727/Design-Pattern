/**
 * @author: 徐杰
 * @description: 增加了只显示规定次数的功能的类 桥 类的功能层次结构
 * @dateTime: 2023/10/25 16:29
 * @Return
 **/
public class CountDisplay extends Display{
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
