/**
 * @author: 徐杰
 * @description: 使用纯文本编写文档的类
 * @dateTime: 2023/10/23 11:07
 * @Return
 **/
public class TextBuilder implements Builder {
    private StringBuilder buffer=new StringBuilder();

    @Override
    public void makeTitle(String title) {
        buffer.append("====================================\n");
        buffer.append("["+title+"]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("🧐"+str+"\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" ."+items[i]+"\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("========================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
