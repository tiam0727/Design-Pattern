package listfactory;

import factory.Item;
import factory.Tray;

import java.util.Iterator;

/**
 * @author: 徐杰
 * @description: 具体零件：表示含有Link和Tray的类
 * @dateTime: 2023/10/23 17:10
 * @Return
 **/
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<li>\n");
        stringBuffer.append(caption+"\n");
        stringBuffer.append("<ul>\n");
        Iterator<Item> it = tray.iterator();
        while (it.hasNext()){
            Item item = it.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</ul>\n");
        stringBuffer.append("</li>\n");
        return stringBuffer.toString();
    }
}
