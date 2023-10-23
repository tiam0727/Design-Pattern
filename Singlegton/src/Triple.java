/**
 * @author: 徐杰
 * @description: 最多只能生成三个Triple实例
 * @dateTime: 2023/10/23 9:23
 * @Return
 **/
public class Triple {
    private static Triple[] triples = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };

    private int id;

    private Triple(int id) {
        this.id = id;
        System.out.println("最多三个实例\n"+"this instance"+id+"id created");
    }

    public static Triple getInstance(int index) {
        return triples[index];
    }

    @Override
    public String toString() {
        return "Triple id="+id;
    }
}
