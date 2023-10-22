package ClassAdapter;

/**
 * @author: 徐杰
 * @description: 扮演适配器的角色
 * @dateTime: 2023/10/22 20:46
 * @Return
 **/
public class PrintBanner extends Banner implements Print{


    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
