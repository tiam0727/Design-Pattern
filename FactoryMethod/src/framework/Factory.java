package framework;

/**
 * @author: 徐杰
 * @description: 实现了create方法的抽象类
 * @dateTime: 2023/10/23 8:31
 * @Return
 **/
public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);
}
