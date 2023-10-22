package Test;

import java.io.IOException;

/**
 * @author: 徐杰
 * @description:
 * @dateTime: 2023/10/22 21:54
 * @Return
 **/
public class Main {
    public static void main(String[] args) {
        FileIO f =new FileProperties();
        try{
            f.readFromFile("D:\\workspace\\Javapro\\Design-Pattern\\Adapter\\src\\Test\\file.txt");
            f.setValue("year","2024");
            f.setValue("month","4");
            f.setValue("day","21");
            f.writeToFile("D:\\workspace\\Javapro\\Design-Pattern\\Adapter\\src\\Test\\newfile.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
