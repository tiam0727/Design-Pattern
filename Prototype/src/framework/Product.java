package framework;

/**
 * @author: 徐杰
 * @description: 声明抽象方法use和createClone的接口
 * @dateTime: 2023/10/23 10:20
 * @Return
 **/
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
