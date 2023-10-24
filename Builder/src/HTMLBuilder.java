import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: 徐杰
 * @description: 使用HTML编写文档的类
 * @dateTime: 2023/10/23 11:08
 * @Return
 **/
public class HTMLBuilder implements Builder{
    private String filename;
    private PrintWriter writer; //用于文件编写的

    @Override
    public void makeTitle(String title) {
        filename=title+".html";//将标题作为文件名
        try{
            writer =new PrintWriter(new FileWriter(filename));
        }catch (IOException e){
            e.printStackTrace();
        }
        writer.println("<html><head><title>"+title+"</title></head><body>");
        //输出标题
        writer.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>"+str+"<p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
        writer.println("</body></html>");
        writer.close();
    }
    public String getResult(){
        return filename;
    }
}
