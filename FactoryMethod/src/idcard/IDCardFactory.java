package idcard;

import framework.Factory;
import framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 徐杰
 * @description: 生产IDCard的工厂类
 * @dateTime: 2023/10/23 8:41
 * @Return
 **/
public class IDCardFactory extends Factory {

    private List owners = new ArrayList<>();
    private int serial=100;
    public List getOwners() {
        return owners;
    }

    @Override
    synchronized public Product createProduct(String owner) {
        serial++;
        return new IDCard(owner,serial);
    }

    @Override
    public void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
}
