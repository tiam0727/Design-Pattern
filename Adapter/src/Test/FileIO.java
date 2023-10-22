package Test;

import java.io.IOException;

/**
 * @author: 徐杰
 * @description: Target角色
 * @dateTime: 2023/10/22 21:51
 * @Return
 **/
public interface FileIO {
    void readFromFile(String filename) throws IOException;
    void writeToFile(String filename) throws IOException;
    void setValue(String key ,String value);
    String getValue(String key);
}
