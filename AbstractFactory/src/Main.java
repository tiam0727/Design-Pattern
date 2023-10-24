import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;


/**
 * @author: 徐杰
 * @description:
 * @dateTime: 2023/10/23 17:31
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory/ListFactory.java");
            System.out.println("Example 2: java Main tablefactory/TableFactory.java");
        }
        Factory factory = Factory.getFactory("tablefactory.TableFactory");
        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");
        Link yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link huya = factory.createLink("虎牙", "http://www.huya.com");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");
        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(google);
        traySearch.add(excite);
        traySearch.add(trayyahoo);

        Page page = factory.createPage("TablePage", "xj");
        page.add(traynews);
        page.add(traySearch);
        page.output();

    }
}
