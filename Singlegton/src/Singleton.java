/**
* @author: 徐杰
* @description: 只存在一个实例的类
* @dateTime: 2023/10/23 9:06
* @Return
**/
public class Singleton {
    private static Singleton singleton=new Singleton();
    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getInstance(){
        return singleton;
    }

}
