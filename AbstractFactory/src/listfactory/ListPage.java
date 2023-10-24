package listfactory;

import factory.Item;
import factory.Page;

import java.util.Iterator;

/**
 * @author: 徐杰
 * @description: 具体零件：表示HTML页面的类
 * @dateTime: 2023/10/23 17:11
 * @Return
 **/
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");
        Iterator<Item> iterator =
                content.iterator();
        while (iterator.hasNext()){
            Item item = iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
