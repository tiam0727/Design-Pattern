package tablefactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

/**
 * @author: 徐杰
 * @description: 表示具体的工厂类制作TableLink、TableTray、TablePage
 * @dateTime: 2023/10/23 18:10
 * @Return
 **/
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
