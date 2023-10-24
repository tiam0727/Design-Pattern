package factory;

/**
 * @author: 徐杰
 * @description: 抽象零件：表示HTML的链接的类
 * @dateTime: 2023/10/23 17:07
 * @Return
 **/
public abstract class Link extends Item{
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
