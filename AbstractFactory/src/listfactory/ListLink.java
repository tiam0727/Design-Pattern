package listfactory;

import factory.Link;

/**
 * @author: 徐杰
 * @description: 具体的零件：表示HTML的链接的类
 * @dateTime: 2023/10/23 17:10
 * @Return
 **/
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\""+url+"\">"+caption+"</a></li>\n";
    }
}
