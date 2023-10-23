/**
 * @author: 徐杰
 * @description: 使用Singleton
 * @dateTime: 2023/10/23 9:09
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        System.out.println("Start:");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1==instance2){
            System.out.println("instance1和instance2是同一个实例");
        }else {
            System.out.println("instance1和instance2不是同一个实例");
        }
        System.out.println("End.");
    }
}
