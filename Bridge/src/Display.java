/**
 * @author: 徐杰
 * @description: 负责显示的类 桥 类的功能层次结构
 * @dateTime: 2023/10/25 16:28
 * @Return
 **/
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void  open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public  final void display(){
        open();
        print();
        close();
    }
}
