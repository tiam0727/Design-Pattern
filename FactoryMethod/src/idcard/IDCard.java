package idcard;

import framework.Product;

/**
 * @author: 徐杰
 * @description: 表示ID卡的类
 * @dateTime: 2023/10/23 8:36
 * @Return
 **/
public class IDCard extends Product {
    private String owner;
    private int serial;
    public IDCard(String owner,int serial) {
        System.out.println("制作"+owner+"的ID卡");
        System.out.println("编号为"+serial);
        this.owner = owner;
        this.serial=serial;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
