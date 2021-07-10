package adapter;

/**
 * @author jiaoyuzhang
 * @date 2021/7/10 15:54
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("叫得难听");
    }

    @Override
    public void fly() {
        System.out.println("飞得不高");
    }
}
