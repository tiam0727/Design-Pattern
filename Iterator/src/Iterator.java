/**
 * @Author: 徐杰
 * @Description: Iterator接口用于遍历集合中的元素，其作用相当于循环语句中的循环变量
 * @DateTime: 2023/10/22 19:50
 * @Params:
 * @Return
 **/

public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
