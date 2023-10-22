package DelegatedAdapter;

/**
 * @author: 徐杰
 * @description: 通过扮演适配器角色的PrintBanner类来弱化(带括号) 或是强化 Hello (带*号)字符串的显示。
 * @dateTime: 2023/10/22 20:48
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printStrong();
        p.printWeak();
    }
}