package factory;

/**
 * @author: 徐杰
 * @description: 方便统一处理Link和Tray的类
 * @dateTime: 2023/10/23 17:07
 * @Return
 **/
public abstract class Item {
    protected String caption;//标题

    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
