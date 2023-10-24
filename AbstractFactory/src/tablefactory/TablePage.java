package tablefactory;

import factory.Item;
import factory.Page;

import java.util.Iterator;

/**
 * @author: 徐杰
 * @description: 具体产品表示HTML页面的类
 * @dateTime: 2023/10/23 18:12
 * @Return
 **/
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator<Item> iterator =
                content.iterator();
        while (iterator.hasNext()){
            Item item = iterator.next();
            buffer.append("<tr>"+item.makeHTML()+"</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }}
