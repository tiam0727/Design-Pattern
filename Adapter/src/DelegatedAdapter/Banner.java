package DelegatedAdapter;

/**
 * @author: 徐杰
 * @description: 实际情况
 * @dateTime: 2023/10/22 20:41
 * @Return
 **/
public class Banner {
    private String string;
    public Banner(String string){
        this.string=string;
    }

    /**
     * 带括号
     */
    public void showWithParen(){
        System.out.println("("+string+")");
    }

    /**
     * 带星号
     */
    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
