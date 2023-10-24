package factory;

import java.util.ArrayList;

/**
 * @author: 徐杰
 * @description: 抽象零件：表示含有Link和Tray的类
 * @dateTime: 2023/10/23 17:08
 * @Return
 **/
public abstract class Tray extends Item{
    protected ArrayList<Item> tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item){
        tray.add(item);
    }
}
