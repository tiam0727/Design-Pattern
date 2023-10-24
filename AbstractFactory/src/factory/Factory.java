package factory;

/**
 * @author: 徐杰
 * @description: 表示抽象工厂的类，制作Link、Tray、Page
 * @dateTime: 2023/10/23 17:06
 * @Return
 **/
public abstract class Factory {

    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
