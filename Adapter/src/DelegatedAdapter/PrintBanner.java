package DelegatedAdapter;
/**
 * @author: 徐杰
 * @description: 扮演适配器的角色
 * @dateTime: 2023/10/22 20:46
 * @Return
 **/
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner=new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {

        banner.showWithAster();
    }
}
