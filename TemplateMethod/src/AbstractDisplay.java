/**
 * @author: 徐杰
 * @description: 只实现了display方法的抽象类
 * @dateTime: 2023/10/22 22:40
 * @Return
 **/
public abstract class AbstractDisplay {
    //交给子类去实现的抽象方法（1）
    public abstract void open();
    //交给子类去实现的抽象方法（2）
    public abstract void print();
    //交给子类去实现的抽象方法（3）
    public abstract void close();
    //本抽象类中实现的display方法
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        //最后关闭。这是display方法所实现的功能
        close();
    }
}
