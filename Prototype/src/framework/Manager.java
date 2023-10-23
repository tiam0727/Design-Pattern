package framework;

import java.util.HashMap;

/**
 * @author: 徐杰
 * @description: 调用createClone方法复制实例的类
 * @dateTime: 2023/10/23 10:21
 * @Return
 **/
public class Manager {
    private HashMap showcase =new HashMap<>();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String productName){
        Product product = (Product) showcase.get(productName);
        return product.createClone();
    }
}
