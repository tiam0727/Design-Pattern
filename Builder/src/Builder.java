/**
 * @author: 徐杰
 * @description: 定义了决定文档结构的方法的抽象类
 * @dateTime: 2023/10/23 11:06
 * @Return
 **/
public interface Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
