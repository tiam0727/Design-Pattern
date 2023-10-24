package factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author: 徐杰
 * @description: 抽象零件：表示HTML页面的类
 * @dateTime: 2023/10/23 17:08
 * @Return
 **/
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList<Item> content=new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        content.add(item);
    }
    public void output(){
        try{
            String filename = title+".html";
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(this.makeHTML());
            fileWriter.close();
            System.out.println(filename+"编写完成.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public abstract String makeHTML() ;
}


