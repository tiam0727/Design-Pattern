

/**
 * @Author: 徐杰
 * @Description: 所要遍历的集合的接口。实现了该接口的类将成为一个可以保存多个元素的集合，就像数组一样。Aggregate有“使聚集”“集合”的意思。
 * @DateTime: 2023/10/22 19:45
 * @Params:
 * @Return
 **/
public interface Aggregate {
    public  abstract Iterator iterator();
}
