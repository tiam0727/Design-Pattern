/**
 * @author: 徐杰
 * @description: 多线程环境下严谨的Singleton
 * @dateTime: 2023/10/23 9:48
 * @Return
 **/
public class MultipleSingleton {
    private static MultipleSingleton singleton=null;
    private MultipleSingleton(){
        System.out.println("生成一个实例");
    }
    public synchronized static MultipleSingleton getInstance(){
        if(singleton == null){
            singleton=new MultipleSingleton();
        }
        return singleton;
    }
}
