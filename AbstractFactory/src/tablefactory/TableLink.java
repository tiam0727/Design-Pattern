package tablefactory;

import factory.Link;

/**
 * @author: 徐杰
 * @description: 具体零件：表示HTML的超链接的类
 * @dateTime: 2023/10/23 18:11
 * @Return
 **/
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\""+url+"\">"+caption+"</a></td>\n";
    }
}
