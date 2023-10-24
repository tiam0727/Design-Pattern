package tablefactory;

import factory.Item;
import factory.Tray;

import java.util.Iterator;

/**
 * @author: 徐杰
 * @description: 表示含有Link和Tray的类
 * @dateTime: 2023/10/23 18:11
 * @Return
 **/
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<td>\n");
        stringBuffer.append("<table width=\"100%\" border=\"1\"><tr>");
        stringBuffer.append("<td bgcolor=\"#ccc\" align=\"center\" colspan=\""+tray.size()+"\"><b>"+caption+"</b></td>");

        stringBuffer.append("</tr>\n");
        stringBuffer.append("<tr>\n");

        Iterator<Item> it = tray.iterator();
        while (it.hasNext()){
            Item item = it.next();
            stringBuffer.append(item.makeHTML());
        }
        stringBuffer.append("</tr></table>");
        stringBuffer.append("</td>\n");
        return stringBuffer.toString();    }
}
